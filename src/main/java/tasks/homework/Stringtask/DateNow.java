package tasks.homework.Stringtask;

import java.util.Date;

public class DateNow {

    public static void main(String[] args) {

        Date dateNow = new Date();
        String str = String.format("%1$s %2$td %2$tB, %2$tY, %2$tI часа %2$tM минут", "Сегодня на дворе:\n", dateNow);
        System.out.println(str);

    }
}
