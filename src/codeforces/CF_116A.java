package codeforces;

import java.util.Scanner;

public class CF_116A {

  public static void main(String[] args) {
    System.out.println(solution());
  }

  public static int solution() {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s [][] = new int [n][3];
    int ans = 0;
    sc.nextLine();

    for (int i = 0; i < n; i++) {
      s[i][0] = sc.nextInt();
      s[i][1] = sc.nextInt();
      s[i][2] = i == 0 ? s[i][1] : (s[i - 1][2] - s[i][0]) + s[i][1];
      sc.nextLine();
      ans = Math.max(s[i][2] , ans);
    }

    return ans;
  }
}
