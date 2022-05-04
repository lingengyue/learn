package designpattern.factorymethod;

/**
 * 工厂方法模式
 * 将工厂抽象成接口，每个产品类对于一个工厂实现类
 */
public class FactoryMethod {

    public static void main(String[] args) {
        CheesePizzaFactory cheesePizzaFactory = new CheesePizzaFactory();
        cheesePizzaFactory.createPizza().order();

        PineapplePizzaFactory pineapplePizzaFactory = new PineapplePizzaFactory();
        pineapplePizzaFactory.createPizza().order();
    }
}

abstract class Pizza {
    abstract void order();
}

class CheesePizza extends Pizza {

    @Override
    void order() {
        System.out.println("芝士披萨");
    }
}

class PineapplePizza extends Pizza {

    @Override
    void order() {
        System.out.println("菠萝披萨");
    }
}

interface PizzaFactory {
    Pizza createPizza();
}

class CheesePizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}

class PineapplePizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new PineapplePizza();
    }
}
