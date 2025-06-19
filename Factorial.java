import java.util.Scanner;

public class Factorial {

    static long findFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long result = findFactorial(num);

        if (result != -1)
            System.out.println("Factorial of " + num + " is: " + result);
    }
}
