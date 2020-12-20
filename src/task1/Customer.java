package task1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private LocalDate birthdate;
    private int card;

    public Customer(int id, String surname, String name, String patronymic, String address,
                     LocalDate birthdate, int card) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.birthdate = birthdate;
        this.card = card;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getCard() {
        return card;
    }
    public void setCard(int card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return (id + ", " + surname + ", " + name + ", " + patronymic + ", " + address + ", " + birthdate + ", "
        + card);
    }

    public static Customer findOldestCustomer(Customer[] customers) {
        Customer oldestCustomer = customers[0];
        for (Customer currentCustomer : customers) {
            if (oldestCustomer.getBirthdate().isAfter(currentCustomer.getBirthdate())) {
                oldestCustomer = currentCustomer;
            }
        }

        return oldestCustomer;
    }

    public static List<Customer> findCreditCard(int start, int end, Customer[] customers) {
        List<Customer> customersWithCard = new ArrayList<>();
        for (Customer currentCustomer : customers) {
            if (currentCustomer.getCard() > start && currentCustomer.getCard() < end) {
                customersWithCard.add(currentCustomer);
            }
        }

        return customersWithCard;
    }

    public static void findAge(Customer[] customers) {
        LocalDate currentDate = LocalDate.now();

        for (Customer customer : customers) {
            int age = Period.between(customer.getBirthdate(), currentDate).getYears();
            System.out.println("Имя: " + customer.getName() +
                    " Фамилия: " + customer.getSurname() + " Возраст: " + age);
        }
    }

}

