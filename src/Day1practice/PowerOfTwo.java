package Day1practice;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the value of N (0 to 30): ");
        int N = sc.nextInt();

        // Validate range
        if (N < 0 || N >= 31) {
            System.out.println("N must be between 0 and 30.");
            return;
        }

        // Print powers of 2
        System.out.println("Powers of 2 up to 2^" + N + ":");

        int power = 1; // 2^0
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + power);
            power *= 2;
        }
    }
}
