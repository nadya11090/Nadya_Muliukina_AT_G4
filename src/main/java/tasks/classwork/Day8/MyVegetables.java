package tasks.classwork.Day8;

import java.util.ArrayList;
import java.util.List;

public class MyVegetables {

    public static void main(String[] args) {

        List<String> vegetables = new ArrayList<>();

        vegetables.add("pomidor");
        vegetables.add("ogurec");
        vegetables.add("kabachok");
        vegetables.add("batat");
        vegetables.add("kartoha");

        for (String word : vegetables) {
            System.out.print(word + " ");
        }

        int count = 0;
        for (String vegetable : vegetables) {
            if (vegetable.contains("a")) {
                count++;
            }
        }
        System.out.print(count);

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.print(vegetables.get(i) + " ");
        }

    }
}
