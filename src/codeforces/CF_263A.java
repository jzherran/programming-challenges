package codeforces;

import java.util.Scanner;

public class CF_263A {

  public static void main(String[] args) {
    System.out.println(solution());
  }

  public static int solution() {
    Scanner sc = new Scanner(System.in);

    int x = 0, y = 0;

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (sc.nextInt() == 1) {
          x = i;
          y = j;
          break;
        }
      }
      sc.nextLine();
    }

    sc.close();
    return Math.abs(x - 2) + Math.abs(y - 2);
  }
}
