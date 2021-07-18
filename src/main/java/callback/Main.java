package callback;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        hello("Abbas",null, abs-> System.out.println("LastName is null "+abs));
    }


    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if (lastName!=null){
            System.out.println(lastName);
        }else {
            callback.accept(firstName);
        }
    }
}
