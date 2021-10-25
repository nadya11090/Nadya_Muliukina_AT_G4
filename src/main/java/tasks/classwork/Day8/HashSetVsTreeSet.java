package tasks.classwork.Day8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetVsTreeSet {

    public static void main(String[] args) {

        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        long t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList1.add("mama");
        }

        System.out.println("HashSet count : " + (System.currentTimeMillis() - t0));

        long t1 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList2.add("mama");
        }

        System.out.println("TreeSet count : " + (System.currentTimeMillis() - t1));

        long t2 = System.currentTimeMillis();

        for (String word : myList1) {
            System.out.println(word);
        }

        System.out.println("HashSet count : " + (System.currentTimeMillis() - t2));

        long t3 = System.currentTimeMillis();

        for (String word : myList2) {
            System.out.println(word);
        }

        System.out.println("TreeSet count : " + (System.currentTimeMillis() - t3));

    }
}
