package codeforces;

import java.util.Scanner;

public class CF_281A {

  public static void main(String[] args) {
    System.out.println(solution());
  }

  public static String solution() {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();

    return (new StringBuilder()
        .append(word.charAt(0))
        .append("").toString()).toUpperCase() + word.substring(1);
  }
}
