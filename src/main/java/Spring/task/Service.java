package Spring.task;

public class Service {


    public void send(String message) {
        System.out.println("Сообщние:" + message );
    }

    public void sendException() throws Exception {
        System.out.println("Исключение ");
        throw new Exception();

    }

}