package tasks.classwork.Day10;

import tasks.classwork.Day9.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "mila", "ramu", "mama", "chisto");

        list.stream().flatMap(s -> Arrays.stream(s.split(""))).peek(System.out::println).max(String::compareTo).get();

        List<Person> people = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 28, Person.Sex.WOMAN),
                new Person("VoVa", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.MAN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN));

        people.stream().min(Comparator.comparingInt(s-> s.getAge())).get();
    }
}
