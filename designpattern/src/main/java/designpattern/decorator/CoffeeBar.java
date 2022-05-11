package designpattern.decorator;

/**
 * 装饰者模式
 * Decorator为装饰器，继承并组合Coffee，可以叠加一维属性
 */
public class CoffeeBar {

    public static void main(String[] args) {
        // 巧克力 + 咖啡
        ChocolateDecorator chocolateDecorator = new ChocolateDecorator(new LongBlackCoffee());
        System.out.println(chocolateDecorator.getDesc() + ": " + chocolateDecorator.cost());

        // 再加牛奶
        MilkDecorator milkDecorator = new MilkDecorator(chocolateDecorator);
        System.out.println(milkDecorator.getDesc() + ": " + milkDecorator.cost());
    }
}
