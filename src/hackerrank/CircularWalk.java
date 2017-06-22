package hackerrank;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author <a href="jhonatan.zambrano@payulatam.com">Jhonatan A. Zambrano Herran</a>
 * @date 5/17/17
 */
public class CircularWalk {

  static int circularWalk(int n, int s, int t, int r_0, int g, int seed, int p) {
    // Complete this function

    LinkedList<Integer> nList = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      if (i == 0) {
        nList.add(i, 1);
      } else {
        nList.add(i, (nList.get(i - 1) * g + seed) % p);
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int s = in.nextInt();
    int t = in.nextInt();
    int r_0 = in.nextInt();
    int g = in.nextInt();
    int seed = in.nextInt();
    int p = in.nextInt();
    int result = circularWalk(n, s, t, r_0, g, seed, p);
    System.out.println(result);
  }
}
