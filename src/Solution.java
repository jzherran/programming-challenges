import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  public static void main(final String args[]) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */

    final Scanner sc = new Scanner(System.in);

    final int n = sc.nextInt();
    final int[][] A = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        A[i][j] = sc.nextInt();
      }
    }

    final int q = sc.nextInt();
    final int[][] Q = new int[q][4];

    for (int i = 0; i < q; i++) {
      for (int j = 0; j < 4; j++) {
        Q[i][j] = sc.nextInt() - 1;
      }
    }

    for (int i = 0; i < Q.length; i++) {
      final int[] t = new int[(Math.abs(Q[i][0] - Q[i][2]) + 1) * (Math.abs(Q[i][1] - Q[i][3]) + 1)];

      int p = 0;
      for (int r = Q[i][0]; r <= Q[i][2]; r++) {
        for (int c = Q[i][1]; c <= Q[i][3]; c++) {
          t[p] = A[r][c];
          p++;
        }
      }

      Arrays.sort(t);

      int ans;

      if (t.length == 1)
        ans = t[0];
      else {
        if (t.length % 2 == 0) {
          ans = Math.floorDiv(t[t.length / 2] + t[(t.length / 2) - 1], 2);
        } else {
          ans = t[(t.length / 2) + 1];
        }
      }

      System.out.println(ans);
    }
    sc.close();
  }
}

/*
 * 4 1 3 2 4 8 1 2 9 1 1 2 2 7 5 3 6 3 1 1 2 2 1 2 3 4 4 4 4 4
 * 
 */