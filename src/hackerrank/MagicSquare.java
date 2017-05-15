package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicSquare {

  public static void main(String[] args) {

    Set<Integer> set = new HashSet<>();

    Scanner in = new Scanner(System.in);
    int[][] s = new int[3][3];
    int[] t = new int[9];

    Arrays.fill(t, 0);

    for (int s_i = 0, t_i = 0; s_i < 3; s_i++) {
      for (int s_j = 0; s_j < 3; s_j++, t_i++) {
        s[s_i][s_j] = in.nextInt();
        t[t_i] = s[s_i][s_j];
      }
    }

    Arrays.sort(t);
    int r = Integer.MAX_VALUE;

    for (int i = 1; i < 28; i++) {
      int tmp = 0;
      for (Integer j: set) {
        tmp += Math.abs(i - j);
      }
      r = Math.min(r, tmp);
    }

    System.out.println(r);
  }
}
