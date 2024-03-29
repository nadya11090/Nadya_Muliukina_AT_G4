package tasks.classwork.Day11;

public class Thread2 {


    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        new Thread(() -> {
           syncMethod("t1");
        }).start();

        Thread.sleep(1000);

        syncMethod("m");
    }

    public static synchronized void syncMethod(String threadName) {
        for (int i = 0; i < 3; i++) {
            try{
                Thread.currentThread().sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s-%s ", threadName, i);
        }
    }
}
