class Product {
    String productname;
    String productcode;
    int productprice;

    Product(String productcode, String productname, int productprice) {
        this.productname = productname;
        this.productcode = productcode;
        this.productprice = productprice;
    }
}

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("101", "Pen", 10);
        Product p2 = new Product("102", "Notebook", 40);
        Product p3 = new Product("103", "Pencil", 5);

        Product lowest = p1;

        if (p2.productprice < lowest.productprice) {
            lowest = p2;
        }
        if (p3.productprice < lowest.productprice) {
            lowest = p3;
        }

        System.out.println("Product with lowest price:");
        System.out.println(
            lowest.productcode + " " +
            lowest.productname + " " +
            lowest.productprice
        );
    }
}
