package codesignal;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

  public static void main(final String[] args) {

    System.out.println(firstDuplicate(new int[] { 8, 4, 6, 2, 6, 4, 7, 9, 5, 8 }));
  }

  static int firstDuplicate(final int[] a) {
    final Set<Integer> t = new HashSet<>();
    for (final int x : a) {
        if (!t.contains(x)) {
            t.add(x);
        } else {
            return x;
        }
    }
    return -1;
  }
}
