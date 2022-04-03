import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁降级
 */
public class ReadWriteLockDownGrading {

    ReadWriteLock lock = new ReentrantReadWriteLock();
    int num = 0;

    private void plus() {
        // 获取写锁
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "线程写");
            // 写数据
            num++;
            // 获取读锁
            lock.readLock().lock();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            // 释放写锁
            lock.writeLock().unlock();
        }
        // 消费数据
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "读取：" + num);
        // 释放写锁
        lock.readLock().unlock();;
    }

    private void read() {
        lock.readLock().lock();
        try {
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "读取：" + num);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            lock.readLock().unlock();
        }
    }



    public static void main(String[] args) {
        ReadWriteLockDownGrading downGrading = new ReadWriteLockDownGrading();

        for (int i = 0; i < 5; i++) {
            new Thread(downGrading::plus, "写线程" + (i + 1)).start();
        }
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                downGrading.read();
            }
        }, "读线程").start();

    }
}
