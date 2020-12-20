package task4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Patient {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String phone;
    private int age;
    private int cardNumber;

    public Patient(int id, String surname, String name, String patronymic, String phone, int age, int cardNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phone = phone;
        this.age = age;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Patient {" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", cardNumber=" + cardNumber +
                '}';
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public static void sortBySurname(Patient[] patients) {
        Arrays.sort(patients, Comparator.comparing(Patient::getSurname)
                .thenComparing(Patient::getName)
                .thenComparing(Patient::getPatronymic));
    }

    public static void sortByAge(Patient[] patients) {
        Arrays.sort(patients, Comparator.comparing(Patient::getAge).reversed());
    }
}
