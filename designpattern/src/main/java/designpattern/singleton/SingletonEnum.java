package designpattern.singleton;

/**
 * 单例模式
 * 枚举
 * 枚举单例可以避免反序列化的方式创建多个实例
 */
public enum SingletonEnum {

    INSTANCE;

    public void doSomething() {
        System.out.println("nice");
    }
}
