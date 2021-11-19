package tasks.homework.Threadtask;

public class Mouse12 {
    //    - создать 7 потоков, в каждом из которых:
    ///       -- создать коллекцию из 18 мышей
//-- проитерировать коллекцию и пикнуть каждой четной мышью
//- запустить потоки

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
