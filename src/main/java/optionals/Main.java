package optionala;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        String value = Optional.ofNullable("null")
                .orElseGet(() -> "Default Value");

        System.out.println(value);
    }


}
