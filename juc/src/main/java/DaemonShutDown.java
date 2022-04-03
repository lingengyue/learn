public class DaemonShutDown {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(100L);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().isDaemon());
            while (true) {

            }
        }, "a");
        thread.setDaemon(true);
        thread.start();
        System.out.println(Thread.currentThread().getName() + " over");
    }
}
