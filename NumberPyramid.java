import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
        {
            // Print spaces for indentation
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}