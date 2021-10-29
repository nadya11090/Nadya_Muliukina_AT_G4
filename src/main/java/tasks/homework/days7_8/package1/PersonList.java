package tasks.homework.days7_8.package1;

import tasks.homework.days7_8.package1.objects.Person;

import java.util.Arrays;
import java.util.List;

public class PersonList {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person(32, "Коля"), new Person(24, "Оля"), new Person(55, "Вася"), new Person(63, "Маша"));

        for (Person person : people) {
            System.out.print(person.getAge() + " ");

        }

        System.out.println();

        for (Person person : people) {

            System.out.print(person.getName() + " ");
        }
        System.out.println();

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());

        }
    }
}
