package tasks.homework.Threadtask;

public class Mouse11 {
    // 1.1 - создать 5 потоков, в каждом из которых:
//-- создать коллекцию из 20 мышей
//-- проитерировать коллекцию и пикнуть каждой мышью
//- запустить потоки одновременно

    public static void main(String[] args) {

        int quantity = 5;
        for (int n = 0; n < quantity; n++) {
            Thread thread = new Thread(() -> {
                for (int i = 1; i < 21; i++) {
                    Mouse mouse = new Mouse(i);
                    mouse.peep();
                }
            });
            thread.start();
        }
    }
}
