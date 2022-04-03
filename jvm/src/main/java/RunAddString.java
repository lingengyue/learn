public class RunAddString {

    public static void main(String[] argv) throws Exception {
        int i = 0;
        while (true) {
            String s = String.valueOf(i++);
            if (i > 100000000) {
                Thread.sleep(20000);
                i = 0;
            }
        }

    }
}
