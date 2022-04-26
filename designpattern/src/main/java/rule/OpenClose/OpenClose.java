package rule.OpenClose;

/**
 * 开闭原则
 * 对扩展开放，对修改关闭
 */
public class OpenClose {

    public static void main(String[] args) {
        // 扩展时可以继承Shape类，而不用修改draw类
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.draw(new Triangle());
        graphicEditor.draw(new Rectangle());
    }
}

class GraphicEditor {

    void draw(Shape shape) {
        shape.draw();
    }
}

abstract class Shape {

    abstract void draw();
}

class Triangle extends Shape {

    @Override
    void draw() {
        System.out.println("三角形");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("长方形");
    }
}