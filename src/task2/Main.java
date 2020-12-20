package task2;

public class Main {
    public static void main(String[] args) {

        Vector vector1 = new Vector(new Point(5,15), new Point(1,7));
        Vector vector2 = new Vector(new Point(-1,4), new Point(3,1));
        double number = 1.5;

        System.out.println(vector1.scalarProduct(vector2));
        System.out.println(vector1.productByNumber(number));

    }
}
