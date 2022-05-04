package designpattern.prototype;

/**
 * 原型模式
 * 通过实现Cloneable，使用Object.clone进行克隆
 */
public class ProtoType {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("多利");
        Sheep clone = sheep.clone();
        System.out.println("原型：" + sheep);
        System.out.println("克隆：" + clone);
    }
}

class Sheep implements Cloneable {

    private String name;

    Sheep(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Sheep clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
