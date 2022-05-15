package designpattern.flyweight;

public class ConcreteWebSite extends WebSite {

    private String type;

    public ConcreteWebSite(String type) {
        System.out.println("新建" + type + "网站");
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("网站发布形式为：" + type);
    }
}
