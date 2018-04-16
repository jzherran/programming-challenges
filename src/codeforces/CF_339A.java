package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class CF_339A {

  public static void main(String[] args) {
    System.out.println(solution());
  }

  public static String solution() {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    StringBuilder sb = new StringBuilder();

    Arrays.stream(line.split("\\+"))
        .mapToInt(Integer::parseInt).sorted()
        .forEach(v -> sb.append(v + "+"));

    String s = sb.toString();
    return s.substring(0, s.length() - 1);
  }
}
