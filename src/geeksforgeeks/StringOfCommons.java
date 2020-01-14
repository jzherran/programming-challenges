package geeksforgeeks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StringOfCommons {

  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);

    int cases = sc.nextInt();
    final String[] result = new String[cases];

    while (cases > 0) {

      final Character[] S = sc.next().chars().mapToObj(c -> (char) c).toArray(Character[]::new);
      final Character[] R = sc.next().chars().mapToObj(c -> (char) c).toArray(Character[]::new);

      final Comparator<Character> order = (o1, o2) -> {
        final int oi1 = (int) o1;
        final int oi2 = (int) o2;
        if (oi1 < oi2)
          return -1;
        else if (oi1 > oi2)
          return 1;
        else
          return 0;
      };

      Arrays.sort(S, order);
      Arrays.sort(R, order);

      for (int i = 0; i < S.length; i++) {
        for (int j = 0; j < R.length; j++) {
          if (result[cases - 1] != null && result[cases - 1].contains(S[i].toString())) {
            continue;
          }
          if (S[i] == R[j]) {
            result[cases - 1] = (result[cases - 1] == null ? "" + S[i] : result[cases - 1] + S[i]);
            break;
          }
        }
      }

      cases--;
    }

    for (int i = result.length - 1; i >= 0; i--) {
      System.out.println((result[i] == null ? "nil" : result[i]));
    }
    sc.close();
  }
}
