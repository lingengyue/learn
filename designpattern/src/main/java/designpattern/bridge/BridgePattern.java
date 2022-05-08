package designpattern.bridge;

/**
 * 桥接模式
 * 将品牌Brand抽象聚合到Phone，让不同品牌和不同类型手机组合
 */
public class BridgePattern {

    public static void main(String[] args) {
        FoldedPhone phone1 = new FoldedPhone(new Vivo());
        phone1.call();

        FoldedPhone phone2 = new FoldedPhone(new XiaoMi());
        phone2.call();
    }
}
