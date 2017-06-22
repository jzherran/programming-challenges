import java.util.Scanner;

/**
 * @author <a href="jhonatan.zambrano@payulatam.com">Jhonatan A. Zambrano Herran</a>
 * @date 5/15/17
 */
public class Duplication {

    /*public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int m = Integer.MIN_VALUE;
        int x[] = new int[q];

        for (int i = 0; i < q; i++) {
            x[i] = sc.nextInt();
            m = Integer.max(m, x[i]);
        }

        String all = solve(m);

        for (int i = 0; i < q; i++)
            System.out.println(all.charAt(x[i]));
    }

    private static String solve(int x) {
        String r = "0";
        while(r.length() < x) {
            r = r + invert(r);
        }
        return r;
    }

    private static String invert(String n) {
        n = n.replaceAll("0", "x");
        n = n.replaceAll("1", "0");
        n = n.replaceAll("x", "1");
        return n;
    }*/

  static String invert(String n) {
    n = n.replaceAll("0", "x");
    n = n.replaceAll("1", "0");
    n = n.replaceAll("x", "1");
    return n;
  }

  static String duplication(int x) {
    String r = "0";
    while (r.length() < x + 1) {
      r = r + invert(r);
    }
    return r.charAt(x) + "";
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for (int a0 = 0; a0 < q; a0++) {
      int x = in.nextInt();
      String result = duplication(x);
      System.out.println(result);
    }
  }
}
