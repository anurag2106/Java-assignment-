import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Prime numbers in the array:");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number);
        i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}