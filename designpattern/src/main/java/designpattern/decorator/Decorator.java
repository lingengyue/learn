package designpattern.decorator;

public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return this.getPrice() + drink.cost();
    }
}
