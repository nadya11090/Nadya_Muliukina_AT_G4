package tasks.homework.days7_8.package1;

import tasks.homework.days7_8.package1.objects.Chair;

import java.util.*;

public class ChairList {
    public static void main(String[] args) {

        List<Chair> furniture = new ArrayList<>(Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4)));
        Map<Integer, Chair> furnitureMap = new HashMap<>();

        for (Chair chair : furniture) {
            System.out.print(chair.getHeight() * chair.getWidht() + " ");
        }

        System.out.println();

        for (int i = 0; i < furniture.size(); i++) {
            furnitureMap.put(i, furniture.get(i));
        }

        for (int key : furnitureMap.keySet()) {
            System.out.print(key + " ");
        }

        System.out.println();

        for (Chair chair : furnitureMap.values()) {
            System.out.print(chair + " ");
        }

        System.out.println();

        for (Map.Entry couples : furnitureMap.entrySet()) {
            System.out.println(couples);
        }
    }
}
