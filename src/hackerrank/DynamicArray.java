package hackerrank;

import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[][] s = new int[n][n];
        int[] s_i = new int[n];
        int lastAns = 0;

        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int seq = ((x ^ lastAns) % n);
            if(t == 1) {
                s[seq][s_i[seq]] = y;
                s_i[seq]++;
            } else {
                lastAns = s[seq][y % n];
                System.out.println(lastAns);
            }
        }

        sc.close();
    }
}
