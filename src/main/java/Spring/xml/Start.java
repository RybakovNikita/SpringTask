package Spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig3.xml");
        Service2 service = context.getBean("Service", Service2.class);
        Long start = System.currentTimeMillis();
        service.send();
        try{
            service.sendException();
        }
        catch (Exception e) {
            System.out.println("Метод sendException отработал");
        }
        Long finish = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (finish-start));
        context.close();
    }




}
