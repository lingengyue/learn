package designpattern.decorator;

public class ChocolateDecorator extends Decorator {
    public ChocolateDecorator(Drink drink) {
        super(drink);
        this.setDesc("巧克力");
        this.setPrice(3f);
    }
}
