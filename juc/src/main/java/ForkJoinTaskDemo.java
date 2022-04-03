import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTaskDemo extends RecursiveTask<Integer> {
    private static final int batchSize = 10;
    private int start;
    private int end;

    ForkJoinTaskDemo(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    protected Integer compute() {
        int result = 0;
        if (end - start <= batchSize) {
            for (int i = start; i <= end; i++) {
                result += i;
            }
            return result;
        }
        else {
            int mid = (start + end) / 2;
            ForkJoinTaskDemo task1 = new ForkJoinTaskDemo(start, mid);
            ForkJoinTaskDemo task2 = new ForkJoinTaskDemo(mid + 1, end);
            task1.fork();
            task2.fork();
            return task1.join() + task2.join();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinTaskDemo forkJoinTaskDemo = new ForkJoinTaskDemo(0, 100);
        // 线程池
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(forkJoinTaskDemo);
        System.out.println(forkJoinTaskDemo.get());
        forkJoinPool.shutdown();

    }
}


