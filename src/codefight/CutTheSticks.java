package codefight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author <a href="mailto:jhonatan.zambrano@payulatam.com">Jhonatan A. Zambrano</a> 29/9/2016
 */
public class CutTheSticks {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> s = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      s.add(sc.nextInt());
    }
    s.sort((o1, o2) -> {
      if (o1 < o2) {
        return -1;
      } else if (o1 > o2) return 1;
      return 0;
    });

    int count = 0;
    for (int i = 0; i < n; i++) {
      Integer min = s.get(i);
      if (min > 0) {
        for (int j = 0; j < n; j++) {
          if (s.get(j) > 0) {
            s.set(j, s.get(j) - min);
            count += 1;
          }
          if (j == n - 1) {
            System.out.println(count);
            count = 0;
          }
        }
      }
    }
  }
}