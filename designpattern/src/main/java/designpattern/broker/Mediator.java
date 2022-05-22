package designpattern.broker;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private final List<Colleague> colleagues = new ArrayList<>();

    public void registerColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void sendMessage(String msg, Colleague colleague) {
        System.out.println(colleague.getName() + "发送消息：" + msg);
        for (Colleague colleague1 : colleagues) {
            if (colleague1 != colleague) {
                colleague1.receiveMessage(msg);
            }
        }
    }
}
