package rule.interfacesegregation;

/**
 * 接口隔离原则
 * 类实现接口时，应依赖于最少的类，避免实现不需要的接口
 * 通过切分接口类进行隔离
 */
public class InterfaceSegregation {

    public static void main(String[] args) {

    }
}

interface Interface1 {
    void run1();
    void run2();
}

interface Interface2 {
    void run3();
    void run4();
}

class A implements Interface1 {

    @Override
    public void run1() {

    }

    @Override
    public void run2() {

    }
}

class B implements Interface2 {

    @Override
    public void run3() {

    }

    @Override
    public void run4() {

    }
}

class C implements Interface1, Interface2 {

    @Override
    public void run1() {

    }

    @Override
    public void run2() {

    }

    @Override
    public void run3() {

    }

    @Override
    public void run4() {

    }
}
