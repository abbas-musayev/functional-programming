package lambda;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {

    public static void main(String[] args) {

        BiFunction<String,Integer, String> upperCaseName= (name ,age)-> {
            // logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("abbas", 22));


    }
}
