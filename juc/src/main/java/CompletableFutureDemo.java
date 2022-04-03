import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDemo {

    public static void main(String[] args) {
        // 这里需要使用传入的线程池，否则使用的默认线程池ForkJoinPool.common是使用守护者线程执行的，main线程执行完没有非守护线程了，jvm就会结束
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return 10;
                }, executorService)
                .thenApply(Object::toString)
                .exceptionally(e -> {
                    e.printStackTrace();
                    return "ERROR";
                })
                .thenAccept(System.out::println);
        executorService.shutdown();
    }
}
