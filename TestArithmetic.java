import Arithmetic.*;

public class TestArithmetic {
    public static void main(String[] args) {

        double a = 20;
        double b = 10;

        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();

        System.out.println("Addition: " + add.calculate(a, b));
        System.out.println("Subtraction: " + sub.calculate(a, b));
        System.out.println("Multiplication: " + mul.calculate(a, b));
        System.out.println("Division: " + div.calculate(a, b));
    }
}