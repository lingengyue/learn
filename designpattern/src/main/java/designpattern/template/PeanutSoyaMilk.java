package designpattern.template;

public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    void addCondiment() {
        System.out.println("第二步：加入花生");
    }
}
