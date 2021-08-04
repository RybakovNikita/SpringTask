package Spring.xml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Service2 {

    private String message;

    public void send() {
        System.out.println("Сообщние:" + message );
    }

    public void sendException() throws Exception {
        System.out.println("Исключение ");
        throw new Exception();

    }
}

