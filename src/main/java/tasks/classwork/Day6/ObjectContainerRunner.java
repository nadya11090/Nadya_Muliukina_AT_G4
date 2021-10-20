package tasks.classwork.Day6;

import java.util.Random;

public class ObjectContainerRunner {

    public static void main(String[] args) {

        ObjectContainer f = new ObjectContainer();
        Random random = new Random();
        while (!f.isFull()) {  //poka ne polniy massiv
            f.add(random.nextInt(100));
            f.add("bugagashechka"); //добавляем строку
        }

        while (!f.isEmpty()) {  //poka ne pustoy izvlekaem

           System.out.println(f.removeLast());
        }
    }
}
