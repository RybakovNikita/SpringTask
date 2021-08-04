package Spring.xml;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Interceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] args = methodInvocation.getArguments();
        String message = (String) args[0];
        System.out.println("Перехваченно:  " + message);
        return methodInvocation.proceed();
    }

}
