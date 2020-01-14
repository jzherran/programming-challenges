package hackerrank;

import java.util.Scanner;

public class MigratoryBirds {

    static int migratoryBirds(final int n, final int[] ar) {
        final int tb[] = new int[5];
        int ans[] = new int[] { -1, -1 };
        for (final int a : ar) {
            tb[a - 1]++;
        }
        for (int t = 0; t < tb.length; t++) {
            if (tb[t] > ans[1]) {
                ans = new int[] { t + 1, tb[t] };
            } else if (ans[1] == tb[t] && ans[0] > (t + 1)) {
                ans = new int[] { t + 1, tb[t] };
            }
        }
        return ans[0];
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        final int result = migratoryBirds(n, ar);
        System.out.println(result);
        in.close();
    }
}

