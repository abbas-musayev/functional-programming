package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = List.of(
                new Person("Abbas", MALE),
                new Person("Aisha",FEMALE)
        );

        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : personList) {
            if (person.gender.equals(FEMALE)){
                females.add(person);
                System.out.println(person);
            }
        }

        // Declarative approach
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        personList.stream()
                .filter(personPredicate)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }


    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}
