import java.util.Scanner;

// User-defined exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class AveragePositiveNumbers {

    // Method to calculate average
    public static double calculateAverage(int[] numbers) throws NegativeNumberException {
        int sum = 0;

        for (int num : numbers) {
            if (num < 0) {
                throw new NegativeNumberException("Negative number encountered: " + num);
            }
            sum += num;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " positive integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        try {
            double avg = calculateAverage(arr);
            System.out.println("Average = " + avg);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}