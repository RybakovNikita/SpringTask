package Spring.task;

public class Aspect {
    public void before() {
        System.out.println("Метод перед ");
    }

    public void after() {
        System.out.println("метод после");
    }

    public void afterProblems() {
        System.out.println("ошибка");
    }
}
