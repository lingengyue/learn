package designpattern.template;

public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void addCondiment() {
        System.out.println("第二步：加入红豆");
    }
}
