package Spring.annotation;


import org.springframework.stereotype.Service;

@Service("sendService")
public class SendService {
    private String message;
    public void send() {
        System.out.println("Сообщение отправлено: " + message);
    }

    public void sendException() throws Exception {
        System.out.println("Выброшено исключение");
        throw new Exception();

    }
}
