package codeforces;

import java.util.Scanner;

public class CF_112A {

  public static void main(String[] args) {
    System.out.println(solution());
  }

  public static int solution() {
    Scanner sc = new Scanner(System.in);
    char[] f = sc.nextLine().toLowerCase().toCharArray();
    char[] s = sc.nextLine().toLowerCase().toCharArray();

    sc.close();

    for (int i = 0; i < f.length; i++) {
      if (f[i] < s[i])
        return -1;
      if (s[i] < f[i])
        return 1;
    }
    return 0;
  }
}
