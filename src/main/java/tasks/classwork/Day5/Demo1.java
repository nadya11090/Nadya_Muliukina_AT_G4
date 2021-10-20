package tasks.classwork.Day5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd.MMM.yyyy");
        //Date date = dateFormat.parse("04.oct.2012");
        String  text = dateFormat.format(new Date());
        System.out.println(text);
    }
}
