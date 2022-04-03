import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    public static void main(String[] args) {
        int count = 5;

        CyclicBarrier cyclicBarrier = new CyclicBarrier(count, () -> {
            System.out.println("全员准备完毕：跑");
        });
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "号位准备完毕");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "号位：跑");
            }, String.valueOf(i + 1)).start();
        }
    }
}
