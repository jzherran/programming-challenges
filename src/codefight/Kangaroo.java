package codefight;

import java.util.Scanner;

/**
 * @author <a href="mailto:jhonatan.zambrano@payulatam.com">Jhonatan A. Zambrano</a> 26/9/2016
 */
public class Kangaroo {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x1 = in.nextInt();
    int v1 = in.nextInt();
    int x2 = in.nextInt();
    int v2 = in.nextInt();

    if (v1 < v2) {
      System.out.println("NO");
    } else {
      if (v1 != v2 && (((x2 - x1) % (v1 - v2))) == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
