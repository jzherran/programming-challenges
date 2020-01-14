package hackerrank;

import java.util.LinkedList;
import java.util.Scanner;

public class CircularWalk {

  static int circularWalk(final int n, final int s, final int t, final int r_0, final int g, final int seed,
      final int p) {
    // Complete this function

    final LinkedList<Integer> nList = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      if (i == 0) {
        nList.add(i, 1);
      } else {
        nList.add(i, (nList.get(i - 1) * g + seed) % p);
      }
    }

    return -1;
  }

  public static void main(final String[] args) {
    final Scanner in = new Scanner(System.in);
    final int n = in.nextInt();
    final int s = in.nextInt();
    final int t = in.nextInt();
    final int r_0 = in.nextInt();
    final int g = in.nextInt();
    final int seed = in.nextInt();
    final int p = in.nextInt();
    final int result = circularWalk(n, s, t, r_0, g, seed, p);
    System.out.println(result);
    in.close();
  }
}
