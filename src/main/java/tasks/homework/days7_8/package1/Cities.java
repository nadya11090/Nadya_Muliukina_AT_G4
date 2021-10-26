package tasks.homework.days7_8.package1;

import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static void main(String[] args) {
        List<String> myCities = new ArrayList<>();
        myCities.add("Minsk");
        myCities.add("Moskva");
        myCities.add("Berlin");

        for (String cities : myCities) {
            System.out.print(cities + "\n");
        }

        int count = 0;

        for (String city : myCities) {
            count += city.length();
        }
        System.out.println("Total letters per words is: " + count);


        for (int i = 0; i < myCities.size(); i++) {
            System.out.print(myCities.get(i) + " ");
        }
    }
}
//Создать пустой список стрингов cities
//Добавить в список 3 города (Минск, Москва, Берлин)
//Проитерировать список через for-each и отпечатать слова в консоль с новой строки
//Посчитать сумму всех буков во всех словах и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел