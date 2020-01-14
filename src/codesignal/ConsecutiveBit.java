package codesignal;

public class ConsecutiveBit {

  public static void main(final String[] args) {
    System.out.println(consecutiveBit(337));
  }

  public static boolean consecutiveBit(final int num) {

    final String s = Integer.toString(num, 2);
    System.out.println(s);
    char lc = '.';
    for (final char a : s.toCharArray()) {
      if (a == lc && a == '1') {
        return true;
      }
      lc = a;
    }
    return false;
  }
}
