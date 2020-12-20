package task3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Car {

    private int id;
    private String mark;
    private String model;
    private LocalDate yearOfIssue;
    private String color;
    private double price;
    private String registrationNumber;

    public Car(int id, String mark, String model, LocalDate yearOfIssue, String color, double price, String registrationNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car {" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}' + "\n";
    }

    public static List<Car> findYearsOfOperation(Car[] cars, String model, int years) {
        LocalDate currentDate = LocalDate.now();
        List<Car> carsOfGivenModel = new ArrayList<>();

        for (Car currentCar : cars) {
            int age = Period.between(currentCar.getYearOfIssue(), currentDate).getYears();
            if (currentCar.getModel().equals(model) && age > years) {
                carsOfGivenModel.add(currentCar);
            }
        }

        return carsOfGivenModel;
    }

    public static List<Car> findYearWithPrice(Car[] cars, LocalDate yearOfIssue, double price) {
        List<Car> carsOfGivenPrice = new ArrayList<>();

        for (Car currentCar : cars) {
            if (currentCar.getYearOfIssue().getYear() == yearOfIssue.getYear() && currentCar.getPrice() > price) {
                carsOfGivenPrice.add(currentCar);
            }
        }

        return carsOfGivenPrice;
    }
}
