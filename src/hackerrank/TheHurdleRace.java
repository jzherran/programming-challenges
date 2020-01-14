package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace {

  public static void main(final String[] args) {
    final Scanner in = new Scanner(System.in);
    final int n = in.nextInt();
    final int k = in.nextInt();
    final int[] h = new int[n];
    for (int h_i = 0; h_i < n; h_i++) {
      h[h_i] = in.nextInt();
    }
    // your code goes here
    final Integer m = Arrays.stream(h).max().getAsInt();
    System.out.println(k - m >= 0 ? 0 : m - k);
    in.close();
  }
}
