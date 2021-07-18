package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    // Supplier cannot be taken on argument as void , only retuns kind of value

    public static void main(String[] args) {
        System.out.println(getDBConnection());
        System.out.println(getDBConnectionSupplier.get());

    }

    static String getDBConnection(){
        return "jdbc://localhost:8080/users";
    }

    static Supplier<String> getDBConnectionSupplier= () ->
            "jdbc://localhost:8080/users";
    }
