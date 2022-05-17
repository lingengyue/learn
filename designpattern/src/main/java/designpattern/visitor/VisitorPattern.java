package designpattern.visitor;

/**
 * 访问者模式
 */
public class VisitorPattern {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        objectStructure.display(new Success());
        objectStructure.display(new Fail());
    }
}
