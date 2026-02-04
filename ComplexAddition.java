import java.util.Scanner;

class ComplexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter real part of first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imag1 = sc.nextDouble();

        
        System.out.print("Enter real part of second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imag2 = sc.nextDouble();

        
        double realSum = real1 + real2;
        double imagSum = imag1 + imag2;

        
        System.out.println("Sum = " + realSum + " + " + imagSum + "i");

        sc.close();
    }
}