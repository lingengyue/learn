package designpattern.simplefactory;

/**
 * 简单工厂
 * 通过传入类型获取对于的具体类
 */
public class SimpleFactory {

    public static void main(String[] args) {
        createPizza("cheese").order();
        createPizza("pineapple").order();
    }

    public static Pizza createPizza(String pizzaType) {
        if ("cheese".equals(pizzaType)) {
            return new CheesePizza();
        }
        else if ("pineapple".equals(pizzaType)) {
            return new PineapplePizza();
        }
        else {
            throw new RuntimeException("没有该PIZZA");
        }
    }

}

abstract class Pizza {

    public abstract void order();
}

class CheesePizza extends Pizza {

    @Override
    public void order() {
        System.out.println("芝士披萨");
    }
}

class PineapplePizza extends Pizza {

    @Override
    public void order() {
        System.out.println("菠萝披萨");
    }
}
