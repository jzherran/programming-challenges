package codeforces;

import java.util.Scanner;

public class CF_58A {

  static String HI = "hello";

  public static void main(String[] args) {
    System.out.println(solution());
  }

  public static String solution() {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int index = 0;

    for (char c: s.toCharArray()) {
      if(index == 5) break;
      if(c == HI.charAt(index)) {
        index++;
      }
    }

    sc.close();
    return (index == 5 ? "YES" : "NO");
  }
}
