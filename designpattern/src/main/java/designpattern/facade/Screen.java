package designpattern.facade;

public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void open() {
        System.out.println("屏幕打开");
    }

    public void close() {
        System.out.println("屏幕关闭");
    }
}
