package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    // Predicate

    public static void main(String[] args) {

        System.out.println(isPhoneNumberIsValid("07777777777"));

        System.out.println(isPhoneNumberIsValid.test("07656"));

        System.out.println(isPhoneNumberIsValid.and(containsNumber3).test("07000000003"));
    }

    static boolean isPhoneNumberIsValid(String number){
        return number.startsWith("07") && number.length() == 11;
    }

    static Predicate<String> isPhoneNumberIsValid = number ->
            number.startsWith("07") && number.length() == 11;

    static Predicate<String> containsNumber3 = number ->
            number.contains("3");
}
