package designpattern.broker;

public abstract class Colleague {

    private String name;

    private Mediator mediator;

    protected Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        this.mediator.registerColleague(this);
    }

    public void sendMessage(String msg) {
        mediator.sendMessage(msg, this);
    }

    public void receiveMessage(String msg) {
        System.out.println(name + "接收到消息：" + msg);
    }

    public String getName() {
        return name;
    }
}
