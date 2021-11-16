package tasks.classwork.Day10;

import tasks.classwork.Day9.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "pap", "rama", "chisto");
        list.stream().flatMap(s -> Arrays.stream(s.split(""))).count();

        int z = list.stream().map(String::length).mapToInt(s-> s % 2 == 0 ? 0 : s).sum();
        System.out.println(z);

        list.stream().collect(Collectors.joining(":", "<p>","</p>"));

        List<Person> people = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 28, Person.Sex.WOMAN),
                new Person("VoVa", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.MAN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN));

        list.stream().collect(Collectors.toMap(x->x.hashCode(), p-> p));

        people.stream().collect(Collectors.groupingBy(p -> p.getSex())).keySet().forEach(System.out::println);
    }
}
