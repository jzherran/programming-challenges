package codeforces;

import java.util.Scanner;

public class CF_266A {

  public static void main(String[] args) {
    System.out.println(solution());
  }

  public static int solution() {
    Scanner sc = new Scanner(System.in);

    int ans = 0;
    String last = "";

    int n = Integer.parseInt(sc.nextLine());
    String l = sc.nextLine();

    for (int i = 0; i < n; i++) {
      String current = String.format("%s", l.charAt(i));
      if (current.equals(last)) {
        ans++;
      } else {
        last = current;
      }
    }

    sc.close();
    return ans;
  }
}