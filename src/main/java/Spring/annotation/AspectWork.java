package Spring.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectWork {

    @Before("execution(* Spring.annotation.SendService.send())")
    public void before() {
        System.out.println("Сейчас будет вызван метод send");
    }

    @After("execution(* Spring.annotation.SendService.send())")
    public void after() {
        System.out.println("Был вызван метод send");
    }

    @AfterThrowing("execution(* Spring.annotation.SendService.sendException())")
    public void throwExc() {
        System.out.println("Была сгенерирована ошибка");
    }
}