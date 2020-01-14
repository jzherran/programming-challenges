package codesignal;

import java.util.Arrays;

public class stringRearrangement {

  public static void main(final String[] args) {
    System.out.println(stringsRearrangement(new String[] { "abc", "abx", "axx", "abc" }));
  }

  static boolean stringsRearrangement(final String[] inputArray) {
    final int[] v = new int[inputArray.length];
    for (int i = 0; i < inputArray.length; i++) {
      for (final char c : inputArray[i].toCharArray())
        v[i] += (int) c - 97;
    }

    final int r = Arrays.stream(v).sum();

    return (v.length % 2 == 0 ? (r % 2 == 0 ? true : false) : (r % 2 == 1 ? true : false));
  }
}
