package designpattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理模式-cglib代理
 * 先新建Enhancer增强类，然后实现MethodInterceptor拦截器接口
 */
public class CglibProxy implements MethodInterceptor {

    private ITeacherDao target;

    public CglibProxy(ITeacherDao target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        // 1. 创建增强类
        Enhancer enhancer = new Enhancer();
        // 2. 设置代理类
        enhancer.setSuperclass(ITeacherDao.class);
        // 3. 设置拦截方法实现类
        enhancer.setCallback(this);
        // 4. 创建代理类返回
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理开始");
        Object invoke = method.invoke(target, objects);
        System.out.println("Cglib代理结束");
        return invoke;
    }

    public static void main(String[] args) {
        ITeacherDao proxy = (ITeacherDao) new CglibProxy(new TeacherDao()).getProxyInstance();
        proxy.teach();
    }
}
