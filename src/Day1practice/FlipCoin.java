package Day1practice;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of flips
        System.out.print("Enter number of times to flip the coin: ");
        int n = sc.nextInt();

        // Validate positive input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int heads = 0;
        int tails = 0;

        // Random coin flip
        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.5) {
                tails++;  // value < 0.5 = Tails
            } else {
                heads++;  // value >= 0.5 = Heads
            }
        }

        // Calculate percentages
        double headPercent = (heads * 100.0) / n;
        double tailPercent = (tails * 100.0) / n;

        // Output
        System.out.println("Total Heads: " + heads);
        System.out.println("Total Tails: " + tails);
        System.out.println("Percentage of Heads: " + headPercent + "%");
        System.out.println("Percentage of Tails: " + tailPercent + "%");
    }
}

