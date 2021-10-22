package tasks.homework.Stringtask;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TransformDate {

    public static void main (String[] args) {
        try {
            String stringDate = "07.09.2020";
            Date date = new SimpleDateFormat("dd.MM.yyyy").parse(stringDate);
            System.out.println( date);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
