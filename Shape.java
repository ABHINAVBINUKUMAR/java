import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Area = " + (Math.PI * r * r));
    }

    public void perimeter() {
        System.out.println("Perimeter = " + (2 * Math.PI * r));
    }
}

class Rectangle implements Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        System.out.println("Area = " + (l * b));
    }

    public void perimeter() {
        System.out.println("Perimeter = " + (2 * (l + b)));
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    c.area();
                    c.perimeter();
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();
                    Rectangle rec = new Rectangle(l, b);
                    rec.area();
                    rec.perimeter();
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}
