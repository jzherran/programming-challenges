package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] h = new int[n];
    for (int h_i = 0; h_i < n; h_i++) {
      h[h_i] = in.nextInt();
    }
    // your code goes here
    Integer m = Arrays.stream(h).max().getAsInt();
    System.out.println(k - m >= 0 ? 0 : m - k);
  }
}
