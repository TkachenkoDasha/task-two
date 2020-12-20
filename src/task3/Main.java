package task3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Car(1, "Lada", "Kalina", LocalDate.of(1998, 7, 28),
                "Green", 120000, "GH 011235"),
                new Car(2, "Lada", "Kalina", LocalDate.of(1989, 9, 21),
                        "Black", 520000, "KL 365821"),
                new Car(3, "Lanos", "Hyyanos", LocalDate.of(2003, 8, 4),
                        "Gray", 135000 , "BN 215795"),
                new Car(4, "Jeep", "Jeepovich",  LocalDate.of(2007, 8, 10),
                        "Black", 750000, "XX 586212"),
                new Car(5, "Mazda", "6", LocalDate.of(2007, 10, 30),
                        "Blue", 630000, "VT 174523")
        };

        System.out.println(Car.findYearsOfOperation(cars, "Kalina", 20));
        System.out.println();
        System.out.println(Car.findYearWithPrice(cars, LocalDate.of(2007, 1, 1), 470000));

    }
}
