package tasks.classwork.Day6;

import java.util.Random;

public class GenericContainerRunner {
    public static void main(String[] args) {

        GenericContainer<Integer> f = new GenericContainer();
        Random random = new Random();
        while (!f.isFull()) {  //poka ne polniy massiv
            f.add(random.nextInt(100));
        }

        while (!f.isEmpty()) {  //poka ne pustoy izvlekaem

            System.out.println(f.removeLast());
        }
    }
}
