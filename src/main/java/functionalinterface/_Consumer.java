package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    // Consumer take 1 argument and return none result

    public static void main(String[] args) {

        Customer abbas = new Customer("Abbas", "+99999");
        // Normal java function
        greetCustomer(abbas);

        // Consumer Functional interface
        greetCustomerByConsumer.accept(abbas);

        greetCustomerByBiConsumer.accept(abbas,true);
    }

    static BiConsumer<Customer,Boolean> greetCustomerByBiConsumer= (customer,showPhoneNumber )->
            System.out.println("Hello "+customer.customerName
                               +(showPhoneNumber ? customer.customerPhone : "******")
            );

    static Consumer<Customer> greetCustomerByConsumer=  customer ->
            System.out.println("Hello "+customer.customerName);



    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.customerName);
    }

    static class Customer{
        private final String customerName;
        private final String customerPhone;

        Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }
}
