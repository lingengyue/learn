package designpattern.proxy;

/**
 * 代理模式-静态代理
 * 代理类聚合目标对象，在目标对象方法（teach）调用前后执行额外操作
 */
public class StaticProxy {

    public static void main(String[] args) {

        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();
    }
}
