package tasks.classwork.Day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        String str = "mama mila ramu mila";
        String[] words = str.split(" ");

        for (String word : words) {
            mySet.add(word);
        }

        for (String word : mySet) {
            System.out.println(word);
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
