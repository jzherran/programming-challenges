package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class CF_339A {

  public static void main(final String[] args) {
    System.out.println(solution());
  }

  public static String solution() {
    final Scanner sc = new Scanner(System.in);
    final String line = sc.nextLine();
    final StringBuilder sb = new StringBuilder();
    sc.close();

    Arrays.stream(line.split("\\+")).mapToInt(Integer::parseInt).sorted().forEach(v -> sb.append(v + "+"));

    final String s = sb.toString();
    return s.substring(0, s.length() - 1);
  }
}
