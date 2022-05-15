package designpattern.proxy;

/**
 * 代理模式-动态代理（JDK代理）
 * 使用Proxy.newProxyInstance建代理对象
 */
public class DynamicProxy {

    public static void main(String[] args) {
        ITeacherDao teacherDao = (ITeacherDao) ProxyFactory.getProxyInstance(new TeacherDao());
        teacherDao.teach();
    }
}
