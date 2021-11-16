package tasks.classwork.Day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDay10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "mila", "ramu", "mama", "chisto");
        boolean a = list.stream().anyMatch("mama"::equals);
        boolean b = list.stream().allMatch(s -> s.contains("m"));
        list.stream().map(s -> s + "m").collect(Collectors.toList());
        list.stream().flatMap(s -> Arrays.stream(s.split("a"))).filter(s -> !s.equals("")).collect(Collectors.toList());

    }
}
