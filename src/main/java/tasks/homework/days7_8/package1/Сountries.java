package tasks.homework.days7_8.package1;

import java.util.ArrayList;
import java.util.List;

public class Сountries {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String countr : countries) {
            System.out.print(countr + ", ");
        }
        System.out.println();

       // Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль-- доделаю

        for (int i = 0; i < countries.size(); i++) {
                System.out.println(countries.get(i));
            }

        }
    }
