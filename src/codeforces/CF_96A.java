package codeforces;

import java.util.Scanner;

public class CF_96A {

  public static void main(String[] args) {
    System.out.println(football());
  }

  public static String football() {

    Scanner sc = new Scanner(System.in);
    char[] t = sc.nextLine().toCharArray();

    int mt = 0;
    char at = 0;

    for (int i = 0; i < t.length; i++) {

      if (at != t[i]) {
        mt = 0;
      }

      at = t[i];

      if (at == '0') {
        mt++;
      } else if (at == '1') {
        mt++;
      }

      if (mt == 7) {
        return "YES";
      }
    }

    sc.close();
    return "NO";
  }
}
