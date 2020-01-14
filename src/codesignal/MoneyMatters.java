package codesignal;

import java.util.Arrays;
import java.util.Scanner;

public class MoneyMatters {

  private static final String IMPOSSIBLE = "IMPOSSIBLE";
  private static final String POSSIBLE = "POSSIBLE";

  public static void main(final String[] args) {

    System.out.println(calculateMatters());
  }

  private static String calculateMatters() {
    final Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();
    final int m = sc.nextInt();
    final int[] n_th = new int[n];

    for (int i = 0; i < n; i++) {
      n_th[i] = sc.nextInt();
    }

    for (int i = 0; i < m; i++) {
      final int p_0 = sc.nextInt();
      final int p_1 = sc.nextInt();

      System.out.println(p_0 + " ---- " + p_1 + " ---- " + Arrays.toString(n_th));

      if ((n_th[p_0] < 0 && n_th[p_1] < 0) || (n_th[p_0] < 0 && n_th[p_1] == 0) || (n_th[p_0] == 0 && n_th[p_1] < 0)) {
        return IMPOSSIBLE;
      } else if (n_th[p_0] > 0 && n_th[p_1] <= 0) {
        n_th[p_0] = n_th[p_0] - n_th[p_1];
        n_th[p_1] = n_th[p_1] + n_th[p_0];
      } else {
        n_th[p_1] = n_th[p_1] - n_th[p_0];
        n_th[p_0] = n_th[p_0] + n_th[p_1];
      }
    }

    sc.close();
    return POSSIBLE;
  }
}
