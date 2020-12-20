package task1;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Customer[] customers = {new Customer(1, "Sidorov", "Sergey", "Sergeevich",
                "Poltava, Pushkina, 5", LocalDate.of(1968, 7, 28), 234567),
                new Customer(2, "Durova", "Vladislava", "Vladimirovna",
                        "Kiev, Kurchatova, 7", LocalDate.of(1989, 9, 21), 365821),
                new Customer(3, "Tkachenko", "Dariia", "Vadimovna",
                        "Poltava, Latysheva, 10", LocalDate.of(1998, 8, 4), 215795),
                new Customer(4, "Pedan", "Inna", "Yuriivna",
                        "Kharkov, Pushkinska, 6", LocalDate.of(1998, 8, 10), 586212),
                new Customer(5, "Zerkaliy", "Alina", "Vitaliivna",
                        "Odessa, Bulgarova, 20b", LocalDate.of(1992, 10, 30), 174523)
        };

      //  Customer oldestCustomer = Customer.findOldestCustomer(customers);
      //  System.out.println(oldestCustomer);

      //  List<Customer> customerWithCard = Customer.findCreditCard(150000, 250000, customers);
      //  customerWithCard.forEach(System.out::println);

        Customer.findAge(customers);


    }
}
