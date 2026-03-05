import java.util.Scanner;

class Publisher {
    String publisher_name;
}

class Book extends Publisher {
    String book_name;
    String author;
}

class Literature extends Book {
    String type;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Publisher Name: ");
        publisher_name = sc.nextLine();

        System.out.print("Book Name: ");
        book_name = sc.nextLine();

        System.out.print("Author: ");
        author = sc.nextLine();

        System.out.print("Literature Type: ");
        type = sc.nextLine();
    }

    void display() {
        System.out.println("Publisher: " + publisher_name);
        System.out.println("Book Name: " + book_name);
        System.out.println("Author: " + author);
        System.out.println("Category: Literature - " + type);
    }
}

class Fiction extends Book {
    String type;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Publisher Name: ");
        publisher_name = sc.nextLine();

        System.out.print("Book Name: ");
        book_name = sc.nextLine();

        System.out.print("Author: ");
        author = sc.nextLine();

        System.out.print("Fiction Type: ");
        type = sc.nextLine();
    }

    void display() {
        System.out.println("Publisher: " + publisher_name);
        System.out.println("Book Name: " + book_name);
        System.out.println("Author: " + author);
        System.out.println("Category: Fiction - " + type);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("1. Literature  2. Fiction");
            System.out.print("Enter category: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                Literature l = new Literature();
                l.read();
                l.display();
            } else {
                Fiction f = new Fiction();
                f.read();
                f.display();
            }
        }
    }
}
