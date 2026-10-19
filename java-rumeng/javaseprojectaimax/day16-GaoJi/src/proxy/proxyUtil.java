package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxyUtil {
    public static StarService createProxy(Star s){
        StarService proxy = (StarService) Proxy.newProxyInstance(s.getClass().getClassLoader(), s.getClass().getInterfaces(), new InvocationHandler() {
            @Override


            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                if ("sing".equals(methodName)) {
                    System.out.println("开始代理准备话筒，收钱20万");
                } else if ("dance".equals(methodName)) {
                    System.out.println("开始代理准备场地，收钱20万");
                }
                Object result = method.invoke(s, args);
                return result;
                }
        });
        return proxy;
    }

}
