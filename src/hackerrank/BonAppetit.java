package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BonAppetit {

  public static void main(String args[] ) throws Exception {
    Scanner sc = new Scanner(System.in);
    sc.nextInt();
    int k = sc.nextInt();
    sc.nextLine();
    int[] c = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int b = sc.nextInt();

    c[k] = 0;
    int t = Arrays.stream(c).sum() / 2;
    System.out.println(t == b ? "Bon Appetit" : (Math.abs(b - t)));
  }
}
