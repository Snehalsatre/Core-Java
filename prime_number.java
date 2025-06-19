import java.util.Scanner;

public class prime_number {

    public void print(int n) {
        if (n <= 1) {
            System.out.println("Number is not prime.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println("Number is prime.");
        else
            System.out.println("Number is not prime.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        prime_number po = new prime_number();
        po.print(num);
    }
}
