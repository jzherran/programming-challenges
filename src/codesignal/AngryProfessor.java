package codesignal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngryProfessor {

  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    int T = Integer.parseInt(sc.nextLine());

    while (T > 0) {
      String[] line = sc.nextLine().split(" ");
      final int N = Integer.parseInt(line[0]);
      final int K = Integer.parseInt(line[1]);
      final List<Integer> a = new ArrayList<>();

      line = sc.nextLine().split(" ");
      int min = Integer.MIN_VALUE;
      for (int i = 0; i < N; i++) {
        final int e = Integer.parseInt(line[i]);
        a.add(e);
        if (e <= 0)
          min = Math.max(min, e);
      }
      a.sort((o1, o2) -> {
        if (o1 < o2) {
          return -1;
        } else if (o1 > o2)
          return 1;
        return 0;
      });
      T -= 1;
      System.out.println(((a.lastIndexOf(min) + 1) >= K ? "NO" : "YES"));
    }
    sc.close();
  }
}
