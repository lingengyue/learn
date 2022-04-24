package rule.liskovsubstitution;

/**
 * 里氏替换原则
 * 子类继承父类时，尽量避免重写父类方法
 */
public class LiskovSubstitution {

    public static void main(String[] args) {
        Phone phone = new MobilePhone();
        // 违背里氏替换原则，重写了父类方法
        // 应该将Phone和MobilePhone设置为兄弟类，而不是父子类
        System.out.println(phone.hasLine());
    }
}

class Phone {
    boolean hasLine() {
        return true;
    }
}

class MobilePhone extends Phone {

    boolean hasLine() {
        return false;
    }
}
