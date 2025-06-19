import java.util.Scanner;

public class DivisorsPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get number input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Divisors of " + number + " are:");
        
        // Print all divisors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
