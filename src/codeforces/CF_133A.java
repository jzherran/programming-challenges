package codeforces;

import java.util.Scanner;

public class CF_133A {

  public static void main(String[] args) {
    System.out.println(solution());
  }

  public static String solution() {
    Scanner sc = new Scanner(System.in);
    String p = sc.nextLine();

    for (char c: p.toCharArray()) {
      if(c == 'H' || c == 'Q' || c == '9') return "YES";
    }

    sc.close();
    return "NO";
  }
}
