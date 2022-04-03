public class AlternatePrint {

    private static int num = 0;

    private synchronized void increase() throws InterruptedException {
        while (num != 0) {
            this.wait();
        }
        num += 1;
        System.out.println(num);
        this.notifyAll();
    }

    private synchronized void decrease() throws InterruptedException {
        while (num != 1) {
            this.wait();
        }
        num -= 1;
        System.out.println(num);
        this.notifyAll();
    }

    public static void main(String[] args) {
        AlternatePrint alternatePrint = new AlternatePrint();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    alternatePrint.decrease();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "a").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    alternatePrint.increase();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "b").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    alternatePrint.decrease();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "c").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    alternatePrint.increase();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "d").start();
    }
}
