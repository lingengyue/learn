package designpattern.adapter;

/**
 * 适配器模式-类适配器
 * 使用类适配器ClassAdapter将Voltage220V转为IVoltage5V
 */
public class ClassAdapter extends Voltage220V implements IVoltage5V {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new ClassAdapter());
    }

    @Override
    public int output() {
        // 220V 转 5V
        return super.output() / 44;
    }
}

class Voltage220V {

    int output() {
        return 220;
    }
}

interface IVoltage5V {
    int output();
}

class Phone {
    void charging(IVoltage5V iVoltage5V) {
        System.out.println("手机充电电压：" + iVoltage5V.output() + "V");
    }
}
