package designpattern.adapter;

/**
 * 适配器模式-对象适配器
 * 使用组合代替继承，符合合成服用原则
 */
public class ObjectAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    ObjectAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new ObjectAdapter(new Voltage220V()));
    }

    @Override
    public int output() {
        return voltage220V.output() / 44;
    }
}
