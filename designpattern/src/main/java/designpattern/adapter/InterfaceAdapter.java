package designpattern.adapter;

/**
 * 适配器模式-接口适配器
 * 通过先使用一个抽象类实现接口，再使用匿名内部类，来避免实现其他不需要的方法
 */
public abstract class InterfaceAdapter implements ApiInterface {

    public static void main(String[] args) {
        // 使用匿名内部类，只需要实现一个接口
        new InterfaceAdapter() {
            @Override
            public void m1() {
                System.out.println("实现了方法m1");
            }
        }.m1();
    }
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}

interface ApiInterface {
    void m1();

    void m2();

    void m3();
}
