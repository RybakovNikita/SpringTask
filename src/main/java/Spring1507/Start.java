package Spring1507;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        WalkBean walkBean = context.getBean("walk", WalkBean.class);
        walkBean.walk();
    }
}
