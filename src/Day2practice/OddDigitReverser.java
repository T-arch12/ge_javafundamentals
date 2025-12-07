package Day2practice;
import java.util.*;

public class OddDigitReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String s = sc.nextLine();

        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if ((c - '0') % 2 == 1) res.append(c);
        }

        System.out.println("Output: " + res);
    }
}

