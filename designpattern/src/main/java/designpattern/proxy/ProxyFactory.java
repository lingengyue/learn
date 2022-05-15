package designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static Object getProxyInstance(ITeacherDao target) {
        return Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("JDK代理开始");
            Object invoke = method.invoke(target, args);
            System.out.println("JDK代理结束");
            return invoke;
        });

    }
}
