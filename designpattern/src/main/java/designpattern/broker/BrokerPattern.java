package designpattern.broker;

/**
 * 中介者模式
 * 同类之间通过中介类Mediator通信
 */
public class BrokerPattern {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Colleague colleague1 = new ConcreteColleague("张三", mediator);
        Colleague colleague2 = new ConcreteColleague("李四", mediator);

        colleague1.sendMessage("吃饭了吗");
        colleague2.sendMessage("吃了");
    }
}
