package Day2practice;
import java.util.*;

public class AirportBoarding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of passengers:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the boarding order:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] sorted = a.clone();
        Arrays.sort(sorted);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != sorted[i]) count++;
        }

        System.out.println("Passengers out of order: " + count);
    }
}
