package tasks.classwork.Day8;

import java.util.ArrayList;
import java.util.List;

public class Names {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Оля");
        names.add("Kоля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for (String word : names) {
            System.out.print(word + " ");
        }
        names.set(2, "Оля");
        names.set(4, "Катя");

        System.out.println();

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        names.remove("Оля");
        names.remove(3);

        for (String word : names) {
            System.out.print(word + " ");
        }

    }
}
