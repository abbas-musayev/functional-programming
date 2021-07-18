package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;

public class CustomerValidatorService {


    private boolean isEmailValid(String email){
        return email.contains("@");
    }

    private boolean isPhoneValid(String phone){
        return phone.startsWith("+994");
    }

    private boolean isAdult(LocalDate adult){
        return Period.between(adult,LocalDate.now()).getYears() > 16;
    }


    public Predicate<Customer> isValidPredicate = customer ->
            isEmailValid(customer.getEmail()) &&
                    isPhoneValid(customer.getPhone()) &&
                    isAdult(customer.getDob());

    public boolean isValid(Customer customer){
        return isEmailValid(customer.getEmail()) &&
                isPhoneValid(customer.getPhone()) &&
                isAdult(customer.getDob());
    }


}
