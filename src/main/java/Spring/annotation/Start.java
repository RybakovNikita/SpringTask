package Spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig4.xml");
        SendService service = context.getBean("sendService", SendService.class);
        Long start = System.currentTimeMillis();
        service.send();
        Long finish = System.currentTimeMillis();
        try{
            service.sendException();
        }
        catch (Exception e) {
            System.out.println("Метод  отработал");
        }
        System.out.println("Время выполнения метода send: " + (finish-start) );
        context.close();
    }



}