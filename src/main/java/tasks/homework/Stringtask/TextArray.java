package tasks.homework.Stringtask;
// найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в косоль

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextArray {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("[0-9]+");
        String myString = "date 3 night 44 sun 5784";
        Matcher m = p.matcher(myString);

        int[] array = {};

        while (m.find()) {

            String str = m.group();
            int arr = Integer.parseInt(str);
            int[] array1 = new int[array.length + 1];

            for (int i = 0; i < array.length; i++) {
                array1[i] = array[i];
            }
            array = array1;
            array[array.length - 1] = arr;

        }
        System.out.println(Arrays.toString(array));
    }

}


