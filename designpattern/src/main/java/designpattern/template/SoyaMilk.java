package designpattern.template;

public abstract class SoyaMilk {

    final void make() {
        select();
        addCondiment();
        soak();
        beat();
    }

    void select() {
        System.out.println("第一步：选择黄豆");
    }

    abstract void addCondiment();

    void soak() {
        System.out.println("第三步：浸泡");
    }

    void beat() {
        System.out.println("第四步：搅拌");
    }
}
