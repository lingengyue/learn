package designpattern.bridge;

public class Vivo implements Brand{
    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }
}
