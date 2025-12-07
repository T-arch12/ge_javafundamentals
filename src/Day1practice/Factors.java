package Day1practice;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number to find its prime factors: ");
        int N = sc.nextInt();

        // If number is less than or equal to 1
        if (N <= 1) {
            System.out.println("No prime factors for this number.");
            return;
        }

        System.out.println("Prime factors of " + N + " are:");

        // Step 1: Print all 2's that divide N
        while (N % 2 == 0) {
            System.out.print(2 + " ");
            N = N / 2;
        }

        // Step 2: Check odd numbers from 3 to sqrt(N)
        for (int i = 3; i * i <= N; i += 2) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N = N / i;
            }
        }

        // Step 3: If N is still > 2, it is a prime number
        if (N > 2) {
            System.out.print(N);
        }
    }
}

