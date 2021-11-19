package tasks.homework.Threadtask;

public class Mouse13 {
    public static void main(String[] args) {

        int quantity = 7;
        for (int n = 0; n < quantity; n++) {
            Thread thread = new Thread(() -> {
                for (int i = 1; i < 19; i++) {
                    Mouse mouse = new Mouse(i);
                    if (i % 2 == 0) {
                        mouse.peep();
                    }
                }
            });
            thread.start();
        }
    }
}
