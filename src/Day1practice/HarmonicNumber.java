package Day1practice;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the value of N (N must be > 0): ");
        int N = sc.nextInt();

        // Validate
        if (N == 0) {
            System.out.println("N cannot be 0. Please enter a positive integer.");
            return;
        }

        // Logic to compute harmonic sum
        double harmonic = 0.0;

        for (int i = 1; i <= N; i++) {
            harmonic += 1.0 / i;  // adding each term
        }

        // Output
        System.out.println("The " + N + "th Harmonic Value is: " + harmonic);
    }
}

