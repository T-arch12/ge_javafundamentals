package Day2practice;
import java.util.*;

public class PasswordEncoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password to encode:");
        String s = sc.nextLine().toUpperCase();

        String vowels = "AEIOU";
        StringBuilder encoded = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                encoded.append('@');
            } else if (Character.isDigit(c) && (c - '0') % 2 == 0) {
                encoded.append('*');
            } else {
                encoded.append(c);
            }
        }

        System.out.println("Encoded Password: " + encoded);
    }
}
