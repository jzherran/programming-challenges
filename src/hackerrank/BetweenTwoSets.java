package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] a = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();
    }
    int[] b = new int[m];
    for (int b_i = 0; b_i < m; b_i++) {
      b[b_i] = in.nextInt();
    }

    int r = 0;
    for (int i = 1;
        i <= Math.max(Arrays.stream(a).max().getAsInt(), Arrays.stream(b).max().getAsInt()); i++) {
      if (areFactors(i, a) && isFactor(i, b)) {
        r++;
      }
    }

    System.out.println(r);
  }

  private static boolean isFactor(int x, int[] b) {
    for (int i : b)
      if (i % x != 0) {
        return false;
      }
    return true;
  }

  private static boolean areFactors(int x, int[] a) {
    for (int i : a)
      if (x % i != 0) {
        return false;
      }
    return true;
  }
}
