

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            // Print spaces for

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
