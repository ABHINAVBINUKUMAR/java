import java.util.LinkedList;
import java.util.Scanner;

public class ClearLinkedListUserInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        // Get number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input elements into LinkedList
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            int value = sc.nextInt();
            list.add(value);
        }

        // Display original list
        System.out.println("Original LinkedList: " + list);

        // Remove all elements
        list.clear();

        // Display after clearing
        System.out.println("LinkedList after removing all elements: " + list);

        sc.close();
    }
}