package designpattern.template;

/**
 * 模板方法模式
 * 抽象类定义一个抽象方法给子类实现
 * 钩子方法：定义一个空方法，子类视情况覆盖
 */
public class TemplatePattern {
    public static void main(String[] args) {
        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
    }
}
