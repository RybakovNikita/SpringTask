package Spring.task;



import Spring.task.Interceptor;
import Spring.task.Service;
import org.springframework.aop.framework.ProxyFactory;

public class Start {
    private static Service target;
    private static Service proxy;

    public static void init() {
        target = new Service();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new Interceptor());
        proxyFactory.setTarget(target);
        proxy = (Service) proxyFactory.getProxy();

    }


    public static void process(String message) {
        target.send(message);
    }

    public static void processProxy(String message) {
        proxy.send(message);
    }

    public static void main(String[] args) {
        init();
        process("4555652232");
        processProxy("4555652232");
        processProxy("4555652232");


    }


}
