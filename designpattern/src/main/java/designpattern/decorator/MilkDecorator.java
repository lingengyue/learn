package designpattern.decorator;

public class MilkDecorator extends Decorator{
    public MilkDecorator(Drink drink) {
        super(drink);
        this.setDesc("牛奶");
        this.setPrice(2f);
    }
}
