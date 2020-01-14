package codesignal;

import java.util.Arrays;

public class RemoveDigits {

  public static void main(final String[] args) {
    System.out.println(Arrays.toString(removeDigits(15243, 2)));
    System.out.println(Arrays.toString(removeDigits(10391938, 4)));
    System.out.println(Arrays.toString(removeDigits(1038, 3)));
  }

  public static long[] removeDigits(final long n, final int k) {
    final String s = String.valueOf(n);
    String z = String.valueOf(Long.MAX_VALUE);
    String x = String.valueOf(Long.MIN_VALUE);
    for (int i = 0; i <= s.length() - k; i++) {
      String t = "";
      for (int j = i; j < i + k; j++) {
        t += s.charAt(j);
      }
      final long l = Long.parseLong(t);
      if (l > Long.parseLong(x)) {
        x = t;
      }
      if (l < Long.parseLong(z)) {
        z = t;
      }
    }
    return new long[] {new Long(z), new Long(x)};
  }
}
