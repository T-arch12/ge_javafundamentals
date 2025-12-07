package Day2practice;
import java.util.*;

public class PatterLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correct = "1234";
        boolean success = false;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter 4-digit pattern (Attempt " + i + " of 5):");
            String inp = sc.nextLine();
            if (inp.equals(correct)) {
                success = true;
                break;
            }
        }

        if (success) System.out.println("Access Granted");
        else System.out.println("System Locked");
    }
}

