package designpattern.bridge;

public class FoldedPhone extends Phone{


    public FoldedPhone(Brand brand) {
        super(brand);
        System.out.println("折叠手机");
    }
}
