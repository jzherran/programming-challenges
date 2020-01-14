package hackerrank;

import java.util.Scanner;

public class UtopiaTree {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n > 0) {
      int x = sc.nextInt();
      int r = 1;
      for (int i = 1; i <= x; i++) {
        if (i % 2 == 0) {
          r++;
        } else {
          r *= 2;
        }
      }
      System.out.println(r);
      n--;
      sc.close();
    }
  }
}
