import org.openjdk.jol.info.ClassLayout;

public class JolDemo {

    public static void main(String[] args) {
        Object obj = new Object();
        Integer integer = new Integer(0);
        Long l = Long.valueOf(0L);
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        System.out.println(ClassLayout.parseInstance(integer).toPrintable());
        System.out.println(ClassLayout.parseInstance(l).toPrintable());
    }
}
