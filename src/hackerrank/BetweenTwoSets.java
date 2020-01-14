package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {

  public static void main(final String[] args) {
    final Scanner in = new Scanner(System.in);
    final int n = in.nextInt();
    final int m = in.nextInt();
    final int[] a = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();
    }
    final int[] b = new int[m];
    for (int b_i = 0; b_i < m; b_i++) {
      b[b_i] = in.nextInt();
    }

    int r = 0;
    for (int i = 1; i <= Math.max(Arrays.stream(a).max().getAsInt(), Arrays.stream(b).max().getAsInt()); i++) {
      if (areFactors(i, a) && isFactor(i, b)) {
        r++;
      }
    }

    System.out.println(r);
    in.close();
  }

  private static boolean isFactor(final int x, final int[] b) {
    for (final int i : b)
      if (i % x != 0) {
        return false;
      }
    return true;
  }

  private static boolean areFactors(final int x, final int[] a) {
    for (final int i : a)
      if (x % i != 0) {
        return false;
      }
    return true;
  }
}
