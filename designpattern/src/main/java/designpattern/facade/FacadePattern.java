package designpattern.facade;

/**
 * 外观模式（过程模式）
 * HomeTheaterFacade将各个过程包装起来，调用时不需要知道里面的具体操作
 */
public class FacadePattern {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.start();
        homeTheaterFacade.end();
    }
}
