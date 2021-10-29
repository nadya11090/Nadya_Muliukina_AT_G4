package tasks.homework.days7_8.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {

    public static void main(String[] args) {

        List<String> birds = new ArrayList<String>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

        for (String birds1 : birds) {
            System.out.print("--" + birds1 + "--" + "\n");
        }

        int count = 0;

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
            String novowelsbird = bird.replaceAll("[аеёиоуыэюя]", "");
            if ((bird.length() - novowelsbird.length()) > 1) {
                count++;
            }
        }
        System.out.println("\n" + count);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        birds.remove(3);
        birds.add(3, "Синица");  // birds.set(3, "Синица");

        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}    //Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
     //   Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--
     //   Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
      //  Проитерировать список по индексу и отпечатать слова в консоль через пробел
      //  Заменить 3-й элемент списка на Синица
      //  Проитерировать список через for-each и отпечатать слова в консоль через пробел