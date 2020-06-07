import java.util.*;

class ForegoneSolution {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    StringBuilder r = new StringBuilder();
    int c = sc.nextInt();

    while (c > 0) {
      int n = sc.nextInt();

      outerloop:
      for (int i = 1; i < n; i++) {

        int j = n - i;

        if (!isDigitPresent(i, 4) && !isDigitPresent(j, 4) && (i + j) == n) {
          r.append(i).append(" ").append(j).append("\n");
          break outerloop;
        }
      }

      c--;
    }
    sc.close();
    System.out.print(r.toString());
  }

  static boolean isDigitPresent(int x, int d) {
    while (x > 0) {
      if (x % 10 == d)
        break;
      x = x / 10;
    }
    return (x > 0);
  }
}