import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AlternatePrintMultipleCondition {
    private int num = 0;
    private int flag = 1;
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    public void print1(int loop) {
        lock.lock();
        try {
            while (flag != 1) {
                c1.await();
            }
            for (int i = 0; i < 5; i++) {
                num++;
                System.out.println(Thread.currentThread().getName() + "::" + "loop=" + loop + "::" + num);
            }
            flag = 2;
            c2.signalAll();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    public void print2(int loop) {
        lock.lock();
        try {
            while (flag != 2) {
                c2.await();
            }
            for (int i = 0; i < 5; i++) {
                num++;
                System.out.println(Thread.currentThread().getName() + "::" + "loop=" + loop + "::" + num);
            }
            flag = 3;
            c3.signalAll();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    public void print3(int loop) {
        lock.lock();
        try {
            while (flag != 3) {
                c3.await();
            }
            for (int i = 0; i < 5; i++) {
                num++;
                System.out.println(Thread.currentThread().getName() + "::" + "loop=" + loop + "::" + num);
            }
            flag = 1;
            c1.signalAll();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] argv) {
        AlternatePrintMultipleCondition multipleCondition = new AlternatePrintMultipleCondition();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    multipleCondition.print1(i);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }, "A").start();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    multipleCondition.print2(i);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }, "B").start();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    multipleCondition.print3(i);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }, "C").start();
    }
}
