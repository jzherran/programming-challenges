package codefight;

import java.util.Scanner;

/**
 * @author <a href="mailto:jhonatan.zambrano@payulatam.com">Jhonatan A. Zambrano</a> 29/9/2016
 */
public class DivisibleSumPairs {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int r = 0;
    int a[] = new int[n];
    int m[][] = new int[(n * (n + 1)) / 2][2];

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
  }
}
