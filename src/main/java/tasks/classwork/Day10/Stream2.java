package tasks.classwork.Day10;

import tasks.classwork.Day9.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "papa", "rama", "chisto");
        list.stream().sorted().collect(Collectors.toList());
        list.stream().sorted((x, y) -> -x.compareTo(y)).distinct().collect(Collectors.toList());

        List<Person> people = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 28, Person.Sex.WOMAN),
                new Person("VoVa", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.MAN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN));

        people.stream().sorted((x, y) -> {
            if (x.getSex() != y.getSex()) {
                return x.getSex().compareTo(y.getSex());
            } else {
                return x.getAge() - y.getAge();
            }
        }).peek(p-> System.out.println(p)).collect(Collectors.toList());
    }
}
