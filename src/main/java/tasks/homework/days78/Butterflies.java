package tasks.homework.days78;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {

    public static void main(String[] args) {

        List<String> myButterflies = new ArrayList<>();
        myButterflies.add("Common blue");
        myButterflies.add("Swallowtail");
        myButterflies.add("Aglais io");
        myButterflies.add("Common blue");


        for (String butterflies : myButterflies) {
            System.out.print("'" + butterflies + "'" + " ");
        }
        System.out.println("\n");

        int counter = 0;

        for (String butterflies : myButterflies) {
            if (butterflies.contains("o")) {
                counter++;
            }
        }
        System.out.println(counter + "\n");


        for (int i = 0; i < myButterflies.size(); i++) {
            System.out.print( myButterflies.get(i) + " ");
        }
        for (String butterflies : myButterflies) {
            System.out.print(butterflies + "\n");
        }
        }

    }



