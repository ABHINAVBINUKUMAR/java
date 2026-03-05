import java.util.Scanner;

class Student {
    int roll;
    String name;
    int academic;

    void readStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Academic Score: ");
        academic = sc.nextInt();
    }
}

class Sports {
    int sports;

    void readSports() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sports Score: ");
        sports = sc.nextInt();
    }
}

class Result extends Student {
    Sports s = new Sports();

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Academic Score: " + academic);
        System.out.println("Sports Score: " + s.sports);
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result();

        r.readStudent();
        r.s.readSports();
        r.display();
    }
}
