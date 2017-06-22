package codefight;

import java.util.HashSet;
import java.util.Set;

/**
 * @author <a href="jhonatan.zambrano@payulatam.com">Jhonatan A. Zambrano Herran</a>
 * @date 6/22/17
 */
public class FirstDuplicate {

  public static void main(String[] args) {

    System.out.println(firstDuplicate(new int[] {8, 4, 6, 2, 6, 4, 7, 9, 5, 8}));
  }

  static int firstDuplicate(int[] a) {
    Set<Integer> t = new HashSet<>();
    for (int x : a) {
        if (!t.contains(x)) {
            t.add(x);
        } else {
            return x;
        }
    }
    return -1;
  }
}
