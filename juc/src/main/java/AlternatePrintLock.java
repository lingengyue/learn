import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AlternatePrintLock {

    private int num = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    private void increase() {
        lock.lock();
        try {
            while (num != 0) {
                condition.await();
            }
            num++;
            System.out.println(num);
            condition.signalAll();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    private void decrease() {
        lock.lock();
        try {
            while (num != 1) {
                condition.await();
            }
            num--;
            System.out.println(num);
            condition.signalAll();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        AlternatePrintLock alternatePrintLock = new AlternatePrintLock();

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    alternatePrintLock.increase();
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }, "a").start();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    alternatePrintLock.decrease();
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }, "b").start();
    }
}
