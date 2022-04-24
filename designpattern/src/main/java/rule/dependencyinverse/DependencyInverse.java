package rule.dependencyinverse;

/**
 * 依赖倒转原则-即使用接口
 * 高层模块不能依赖于底层模块，二者都应该依赖于其抽象；抽象不能依赖于细节，细节应该依赖于抽象
 */
public class DependencyInverse {

    public static void main(String[] args) {
        Person person = new Person();
        // Person不依赖于具体类（方法入参类型），而依赖于接口Receivable
        person.receive(new Email());
        person.receive(new Message());
    }
}

interface Receivable {
    String getInfo();
}

class Email implements Receivable {

    @Override
    public String getInfo() {
        return "电子邮件信息";
    }
}

class Message implements Receivable {

    @Override
    public String getInfo() {
        return "短信信息";
    }
}

class Person {
    void receive(Receivable receivable) {
        System.out.println(receivable.getInfo());
    }
}
