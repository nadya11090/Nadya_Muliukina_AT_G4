package tasks.homework.Cycletask;

import java.util.Random;

public class ArrayMin {
    public void array() {
        //создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)
        int[] array = new int[7];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

    }
}
