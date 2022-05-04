package designpattern.abstractfactory;

/**
 * 抽象工厂
 * 将多种工厂抽象聚合起来
 */
public class AbstractFactory {

    public static void main(String[] args) {
        Factory shapeFactory = getFactory("shape");
        shapeFactory.getShape("triangle").draw();
        shapeFactory.getShape("rectangle").draw();
        Factory colorFactory = getFactory("color");
        colorFactory.getColor("red").fill();
        colorFactory.getColor("yellow").fill();
    }

    public static Factory getFactory(String factoryType) {
        if ("shape".equals(factoryType)) {
            return new ShapeFactory();
        }
        else if ("color".equals(factoryType)) {
            return new ColorFactory();
        }
        return null;
    }
}

interface Factory {
    Shape getShape(String shapeType);
    Color getColor(String colorType);
}

class ShapeFactory implements Factory {

    @Override
    public Shape getShape(String shapeType) {
        if ("triangle".equals(shapeType)) {
            return new TriangleShape();
        }
        else if ("rectangle".equals(shapeType)) {
            return new RectangleShape();
        }
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}

class ColorFactory implements Factory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if ("red".equals(colorType)) {
            return new Red();
        }
        else if ("yellow".equals(colorType)) {
            return new Yellow();
        }
        return null;
    }
}

interface Shape {
    void draw();
}

class TriangleShape implements Shape {

    @Override
    public void draw() {
        System.out.println("三角形");
    }
}

class RectangleShape implements Shape {

    @Override
    public void draw() {
        System.out.println("长方形");
    }
}

interface Color {
    void fill();
}

class Red implements Color {

    @Override
    public void fill() {
        System.out.println("红色");
    }
}

class Yellow implements Color {

    @Override
    public void fill() {
        System.out.println("黄色");
    }
}


