package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author <a href="jhonatan.zambrano@payulatam.com">Jhonatan A. Zambrano Herran</a>
 * @date 5/16/17
 */
public class FightMonsters {

  static int getMaxMonsters(int n, int hit, int t, int[] h) {
    Arrays.sort(h);
    int r = 0;
    for (int i = 0; t > 0 && i < n; i++) {
      final Double ceil = Math.ceil(new Double(h[i]) / new Double(hit));
      if ((t - ceil.intValue()) >= 0) {
        r++;
        t -= ceil.intValue();
      }
    }
    return r;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int hit = in.nextInt();
    int t = in.nextInt();
    int[] h = new int[n];
    for (int h_i = 0; h_i < n; h_i++) {
      h[h_i] = in.nextInt();
    }
    int result = getMaxMonsters(n, hit, t, h);
    System.out.println(result);
  }
}
