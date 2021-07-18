package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+99484798563",
                LocalDate.of(1999, 01, 25)
        );
//        System.out.println(new CustomerValidatorService().isValid(customer));

        // Using CombinatorPattern
        ValidationResult result = CustomerRegistrationValidator
                .isEmailValid()
                .and(isPhoneValid())
                .and(isAdultValid())
                .apply(customer);

        System.out.println(result);

        if (result != SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
