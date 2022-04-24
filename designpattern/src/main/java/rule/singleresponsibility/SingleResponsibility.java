package rule.singleresponsibility;

/**
 * 单一职责原则
 */
public class SingleResponsibility {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.fly("飞机");
        vehicle.sail("轮船");
    }
}

class Vehicle {
    public void run(String name) {
        System.out.println(name + "正在公路上行驶");
    }

    public void fly(String name) {
        System.out.println(name + "正在空中飞行");
    }

    public void sail(String name) {
        System.out.println(name + "正在水中行驶");
    }

}
