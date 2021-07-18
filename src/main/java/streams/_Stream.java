package streams;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Abbas", Gender.MALE),
                new Person("Aisha",Gender.FEMALE)
        );

        personList.stream()
                .map(person -> person.name)// 
                .mapToInt(person -> person.length())
                .forEach(System.out::println);

        // CTRL+ALT+V


        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        boolean containsOnlyFemales = personList.stream()
                .allMatch(personPredicate);  // butun hamisi True olarsa true qaytarir

        boolean anyMatch = personList.stream()
                .anyMatch(personPredicate); // herhansisa biri True olarsa true qaytarir

        boolean noneMatch = personList.stream()
                .noneMatch(personPredicate);// herbiri olmazsa true qaytarir

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
