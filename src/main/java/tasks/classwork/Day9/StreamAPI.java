package tasks.classwork.Day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "mila", "ramu", "mama", "chisto");
        long count = list.stream().filter("mama"::equals).count();
        System.out.println(count);

        String x = list.stream().findFirst().orElse("mama");
        System.out.println(x);

        String y = list.stream().filter("mama"::equals).findFirst().get();
        System.out.println(y);

        String z = list.stream().skip(4).findFirst().get();
        System.out.println(z);

        //String[] a = (String[]) list.stream().skip(2).limit(2).toArray();
        System.out.println((String[]) list.stream().skip(2).limit(2).toArray());

        List b = list.stream().distinct().filter(fjfj -> fjfj.contains("m")).collect(Collectors.toList());
        System.out.println(list.stream().distinct().filter(fjfj -> fjfj.contains("m")).collect(Collectors.toList()));
    }
}
