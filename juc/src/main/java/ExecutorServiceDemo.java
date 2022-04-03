import java.util.concurrent.*;

public class ExecutorServiceDemo {

    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(3,
                5,
                10L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1024),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 10; i++) {
            final int num = i;
            executorService.execute(() -> {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(num);
            });
        }
        executorService.shutdown();
    }
}
