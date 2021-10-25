package tasks.classwork.Day8;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

    public static void main(String[] args) {

        Map<Integer, String> words = new HashMap<>();
        String[] array = "mama mila ramu".split(" ");

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }

        for (int x : words.keySet()) {
            System.out.println(x);
        }

        for (String s : words.values()) {
            System.out.println(s);
        }

    }
}
