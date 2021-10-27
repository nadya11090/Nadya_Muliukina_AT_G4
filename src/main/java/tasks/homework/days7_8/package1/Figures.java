package tasks.homework.days7_8.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Figures {

    public static void main(String[] args) {

        List<String> figures = new ArrayList<String>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));

        for (String figure : figures) {
            System.out.print(figure + " - ");
        }

        int count = 0;

        for (String figure : figures) {
            if (!figure.contains("и")) {
                count++;
            }
        }
        System.out.println("\n" + count);


        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();

        figures.add(3, "Треугольник");

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}
