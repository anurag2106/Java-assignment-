import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");

            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case
                    5:
                    System.out.println("Exiting the calculator.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();

    }

    public static void addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double
        sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public static void subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double
        difference = num1 - num2;
        System.out.println("Difference: " + difference);
    }

    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double
        product = num1 * num2;
        System.out.println("Product: " + product);
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: Division by zero.");
        } else {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);

        }
    }
}