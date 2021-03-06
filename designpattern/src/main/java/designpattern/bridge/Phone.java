package designpattern.bridge;

public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void call() {
        brand.call();
    }
}
