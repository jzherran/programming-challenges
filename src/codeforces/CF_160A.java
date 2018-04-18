package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class CF_160A {

  public static void main(String[] args) {
    System.out.println(solution());
  }

  public static int solution() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c[] = new int[n];
    int t = 0, r = 0;

    for(int i = 0; i < n; i++) {
      c[i] = sc.nextInt();
      t += c[i];
    }
    sc.nextLine();
    Arrays.sort(c);

    for (int i = n - 1, sum = 0; i >= 0 && sum <= (t / 2); i--) {
      sum += c[i];
      r++;
    }

    sc.close();
    return r;
  }
}
