package tasks.homework.Stringtask;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TransformDate {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat from = new SimpleDateFormat("HH.mm dd.MM.yyyy");
        SimpleDateFormat toMyFormat = new SimpleDateFormat("dd.MM.yyyy HH.mm");
        try {

            String reformStr = toMyFormat.format(from.parse("22.00 07.09.2020"));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
