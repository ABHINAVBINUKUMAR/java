import java.util.Scanner;

class Area {

    // Area of Circle
    double calculate(double radius) {
        return 3.14 * radius * radius;
    }

    // Area of Rectangle
    double calculate(double length, double breadth) {
        return length * breadth;
    }

    // Area of Triangle
    double calculate(float base, float height) {
        return 0.5 * base * height;
    }
}

public class OverloadArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        // Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + obj.calculate(r));

        // Rectangle
        System.out.print("\nEnter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + obj.calculate(l, b));

        // Triangle
        System.out.print("\nEnter base and height of triangle: ");
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        System.out.println("Area of Triangle: " + obj.calculate(base, height));

        sc.close();
    }
}