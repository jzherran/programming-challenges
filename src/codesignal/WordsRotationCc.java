package codesignal;

import java.util.Arrays;

public class WordsRotationCc {

  public static void main(final String[] args) {

    final String[] w = new String[] { "apple", "anger", "monks", "stink" };

    System.out.println(Arrays.toString(wordsRotationCc(w)));
  }

  private static String[] wordsRotationCc(final String[] w) {

    final String[] r = new String[w[0].length()];
    for (int i = 0; i < w.length; i++) {
      for (int j = 0; j < r.length; j++) {
        r[j] = r[j] + w[i].charAt(i);
      }
    }
    return r;
  }
}
