package designpattern.facade;

public class DvdPlayer {

    private static DvdPlayer instance = new DvdPlayer();

    public static DvdPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD打开");
    }

    public void off() {
        System.out.println("DVD关闭");
    }
}
