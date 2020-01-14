package codesignal;

import java.util.Scanner;

public class CircularArrayRotation {

  public static void main(String[] args) {
    int n;
    int k;
    int q;
    int a[];
    int qr[];

    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] split = line.split(" ");

    n = Integer.parseInt(split[0]);
    k = Integer.parseInt(split[1]);
    q = Integer.parseInt(split[2]);
    line = sc.nextLine();

    a = new int[n];
    split = line.split(" ");
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(split[i]);
    }

    qr = new int[q];
    int movements = k % n;
    for (int i = 0; i < q; i++) {
      int index = sc.nextInt() - movements;
      if (index < 0) {
        qr[i] = n + index;
      } else {
        qr[i] = index;
      }
    }

    for (int i : qr) {
      System.out.println(a[i]);
    }

    sc.close();
  }
}
