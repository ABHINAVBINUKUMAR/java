import java.util.ArrayList;
import java.util.Scanner;

// Generic Stack Class
class Stack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    // Push
    public void push(T item) {
        stack.add(item);
        System.out.println(item + " pushed to stack");
    }

    // Pop
    public T pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    // Display
    public void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack: " + stack);
        }
    }
}

// Main Class
public class GenericStackMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Using Integer type (can change to String if needed)
        Stack<Integer> stack = new Stack<>();

        int choice;

        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    Integer popped = stack.pop();
                    if (popped != null) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}