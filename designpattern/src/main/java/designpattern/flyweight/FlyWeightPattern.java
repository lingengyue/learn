package designpattern.flyweight;

/**
 * 享元模式-共享对象
 * 即使用池存储共享对象
 */
public class FlyWeightPattern {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        factory.getWebSite("新闻").use();
        factory.getWebSite("博客").use();
        factory.getWebSite("新闻").use();
    }
}
