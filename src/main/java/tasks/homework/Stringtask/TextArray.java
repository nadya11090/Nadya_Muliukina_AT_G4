package tasks.homework.Stringtask;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextArray {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[0-9]+");
        String myString = "date 3 night 44 sun 5784";
        Matcher m = p.matcher(myString);
        while (m.find()) {
            System.out.println(m.group());

        }
    }

}
