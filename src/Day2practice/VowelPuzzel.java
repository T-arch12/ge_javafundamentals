package Day2practice;
import java.util.*;

public class VowelPuzzel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        String vowels = "aeiou";

        if (word.length() < 3) {
            System.out.println("Invalid");
            return;
        }

        if (!vowels.contains("" + word.charAt(0)) ||
                !vowels.contains("" + word.charAt(word.length() - 1))) {
            System.out.println("Invalid");
            return;
        }

        int count = 0;
        for (int i = 1; i < word.length() - 1; i++) {
            if (vowels.contains("" + word.charAt(i))) count++;
        }

        if (count == 2) System.out.println("Valid");
        else System.out.println("Invalid");
    }
}
