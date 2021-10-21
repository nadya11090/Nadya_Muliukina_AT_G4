package tasks.homework.Stringtask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Duplicate {

    public static void main(String[] args) {
        String duplicatePattern = "(?i)\\b(\\w+)\\b[\\w\\W]*\\b";
        Pattern p = Pattern.compile(duplicatePattern);
        String phrase = "dog cat dog mouse";
        Matcher m = p.matcher(phrase);
        String val = null;
        while (m.find()) {
            val = m.group();
            System.out.println("Matching segment is: " + val);
            System.out.println("Duplicate word: " + m.group(1));
        }

    }
}
