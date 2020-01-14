package codesignal;

import java.util.Scanner;

public class DivisibleSumPairs {

  public static void main(final String[] args) {
    final Scanner in = new Scanner(System.in);
    final int n = in.nextInt();
    final int k = in.nextInt();
    final int a[] = new int[n];
    int r = 0;

    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();
    }

    for (int a_i = 0; a_i < n; a_i++) {
      for (int a_j = a_i + 1; a_j < n; a_j++) {
        if (((a[a_i] + a[a_j]) % k) == 0) {
          r += 1;
        }
      }
    }

    System.out.println(r);
    in.close();
  }
}
