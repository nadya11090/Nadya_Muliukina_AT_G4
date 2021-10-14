package tasks.homework.Cycletask;

import java.util.Random;

public class Array {
    public void array() {
        //создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)
        int[] array = new int[7];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        //- пройти по массиву и вывести в консоль все элементы
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //- пройти по массиву и вывести в консоль все элементы в обратном порядке
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //- каждый элемент массива умножить на 5 и вывести результат в консоль
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * 5 + " ");
        }
        System.out.println("\n");

        // - каждый элемент массива возвести в квадрат и вывести результат в консоль
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * i + " ");
        }
       // - найти минимальный элемент массива и вывести результат в консоль


    }
}