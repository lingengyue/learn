import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    private static int count = 10;

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                System.out.println("线程" + Thread.currentThread().getName() + "退出");
                countDownLatch.countDown();
            }, String.valueOf(i)).start();
        }
        countDownLatch.await();
        System.out.println("main退出");
    }
}
