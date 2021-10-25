package tasks.classwork.Day8;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        String str = "mama mila ramu";
        String[] words = str.split(" ");
        for (String word : words) {
            myList.add(word);
        }

        for (String word : myList) {
            System.out.println(word);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));

        }
    }
}