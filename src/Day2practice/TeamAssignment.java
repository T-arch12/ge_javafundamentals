package Day2practice;
import java.util.*;

public class TeamAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players (must be even):");
        int n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.println("Number of players must be even.");
            return;
        }
        System.out.println("Enter the skill scores of the players separated by space:");
        int[] a = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }

        int halfCount = n / 2;
        int maxS = total;
        boolean[][] dp = new boolean[halfCount + 1][maxS + 1];
        int[][] parent = new int[halfCount + 1][maxS + 1];
        for (int i = 0; i <= halfCount; i++) Arrays.fill(parent[i], -1);
        dp[0][0] = true;

        for (int idx = 0; idx < n; idx++) {
            for (int k = Math.min(halfCount, idx + 1); k >= 1; k--) {
                for (int s = 0; s + a[idx] <= maxS; s++) {
                    if (dp[k - 1][s] && !dp[k][s + a[idx]]) {
                        dp[k][s + a[idx]] = true;
                        parent[k][s + a[idx]] = idx;
                    }
                }
            }
        }

        int bestS = -1;
        int bestDiff = Integer.MAX_VALUE;
        for (int s = 0; s <= maxS; s++) {
            if (dp[halfCount][s]) {
                int diff = Math.abs((total - s) - s);
                if (diff < bestDiff) {
                    bestDiff = diff;
                    bestS = s;
                }
            }
        }

        boolean[] chosen = new boolean[n];
        int k = halfCount;
        int curS = bestS;
        while (k > 0) {
            int idx = parent[k][curS];
            chosen[idx] = true;
            curS -= a[idx];
            k--;
        }

        List<Integer> teamA = new ArrayList<>();
        List<Integer> teamB = new ArrayList<>();
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < n; i++) {
            if (chosen[i]) {
                teamA.add(a[i]);
                sumA += a[i];
            } else {
                teamB.add(a[i]);
                sumB += a[i];
            }
        }

        System.out.println("Team A: " + teamA + " | Team B: " + teamB);
        System.out.println("Team A total skill: " + sumA + " | Team B total skill: " + sumB);
        System.out.println("Skill difference: " + Math.abs(sumA - sumB));
    }
}
