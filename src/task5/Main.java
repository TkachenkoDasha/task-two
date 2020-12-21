package task5;

public class Main {

    public static void main(String[] args) {

        int sum1 = sum(1, 2 , 14, -5, 7);
        System.out.println("Сумма1: " + sum1);

        int sum2 = sum(4, 1 , -3, 10, -5, 2);
        System.out.println("Сумма2: " + sum2);


    }

    public static int sum (int ... number) {
        System.out.println("Число аргументов: " + number.length);
        int sum = 0;

        for (int i : number) {
            sum += i;
        }

        return sum;
    }
}
