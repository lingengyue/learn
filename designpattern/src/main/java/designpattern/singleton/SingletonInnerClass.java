package designpattern.singleton;

/**
 * 单例模式
 * 静态内部类
 */
public class SingletonInnerClass {

    private static class SingletonInstance {
        // 因为外部类加载的时候，不会加载静态内部类，所以会延迟初始化实例
        // 同时jvm初始化类的静态变量是线程安全的
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
