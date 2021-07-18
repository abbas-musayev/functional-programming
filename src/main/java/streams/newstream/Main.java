package streams.newstream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static streams.newstream.Gender.FEMALE;
import static streams.newstream.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        List<Person> people =getPeople;
/*
        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (person.getGender().equals(FEMALE)){
                females.add(person);
            }
*/

        // Declarative approach

        // filter
        people.stream()
                .filter(person -> person.getGender().equals(FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // sort
        people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // AllMatch
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 5);
    }
    private static List<Person> getPeople =
            List.of(
                    new Person("Abbas",22, MALE),
                    new Person("Aisha",20, FEMALE),
                    new Person("Togrul",21, MALE)
    );
}
