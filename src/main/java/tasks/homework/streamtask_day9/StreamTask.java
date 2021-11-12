package tasks.homework.streamtask_day9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTask {
    //- для всех четных значений длин от 1 до 20 дюймов вывести в консоль значения в дюймах, певерести значения в сантиметры и найти сумму
    public static void main(String[] args) {

        List<Integer> evenNumbers = Stream.iterate(1, n -> n + 1)
                .limit(20).filter(number -> number % 2 == 0).filter(number -> (number > 1 && number < 20))
                .collect(Collectors.toList());

        double cmToInch = evenNumbers.stream().mapToDouble(x -> x * 2.54).sum();
        System.out.println(cmToInch);
    }
}
