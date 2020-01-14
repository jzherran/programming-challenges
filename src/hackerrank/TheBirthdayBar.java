package hackerrank;

import java.util.Scanner;

public class TheBirthdayBar {

    static int getWays(final int[] squares, final int d, final int m) {
        // Complete this function
        int r = 0;
        for (int i = 0; i <= squares.length - m; i++) {
            int s = 0;
            for (int j = i; j < (i + m); j++) {
                s += squares[j];
            }
            if (s == d)
                r++;
        }
        return r;
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        final int d = in.nextInt();
        final int m = in.nextInt();
        final int result = getWays(s, d, m);
        System.out.println(result);
        in.close();
    }
}
