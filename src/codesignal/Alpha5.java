package codesignal;

public class Alpha5 {

  public static void main(final String[] args) {
    System.out.println(alpha5("yahoo"));
  }

  static char alpha5(final String s) {
    int n = 0;
    for (final char c : s.toCharArray())
      n += (int) c - 97;
    return Character.toUpperCase((char) ((n % 26) + 97));
  }
}
