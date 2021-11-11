package tasks.classwork.Day9;

import java.util.Arrays;
import java.util.List;

public class PersonList {
    public static void main(String[] args) {
        List<Person> People = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 28, Person.Sex.WOMAN),
                new Person("VoVa", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.MAN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN));

        int count = 0;
        for (Person people : People) {
            if (((people.getAge() < 60 && people.getSex().equals(Person.Sex.MAN))
                    || (people.getSex().equals(Person.Sex.WOMAN) && people.getAge() < 55))
                    && (people.getAge() > 18)) {
                count++;

            }
        }
        System.out.println(count);

        long cp = People.stream().filter(people -> ((people.getAge() < 60 && people.getSex().equals(Person.Sex.MAN))
                || (people.getSex().equals(Person.Sex.WOMAN) && people.getAge() < 55))
                && (people.getAge() > 18)).count();
        System.out.println(cp);
    }
}