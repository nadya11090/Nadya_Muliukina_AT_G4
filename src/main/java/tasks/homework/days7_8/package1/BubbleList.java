package tasks.homework.days7_8.package1;

import tasks.homework.days7_8.package1.objects.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleList {

    public static void main(String[] args) {

        List<Bubble> bubbles = new ArrayList<>(Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO")));
        int volumes = 0;

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
            volumes += bubble.getVolume();
        }

        System.out.println();

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }

        System.out.println("\n" + volumes);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
