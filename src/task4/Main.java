package task4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Patient[] patients = {new Patient(1, "Sidorov", "Sergey", "Sergeevich",
                "16448879", 28, 234567),
                new Patient(2, "Sidorov", "Vladislav", "Vladimirovich",
                        "848653154",31, 365821),
                new Patient(3, "Tkachenko", "Dariia", "Vadimovna",
                        "5454552", 22, 215795),
                new Patient(4, "Sidorov", "Sergey", "Yuriivich",
                        "8561546", 17, 586212),
                new Patient(5, "Zerkaliy", "Alina", "Vitaliivna",
                        "546646546", 27, 174523)
        };

        Patient.sortBySurname(patients);
        Arrays.stream(patients).forEach(System.out::println);

        System.out.println();

        Patient.sortByAge(patients);
        Arrays.stream(patients).forEach(System.out::println);
    }
}
