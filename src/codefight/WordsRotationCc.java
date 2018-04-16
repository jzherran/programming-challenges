package codefight;

import java.util.Arrays;

public class WordsRotationCc {

  public static void main(String[] args) {

    String[] w = new String[] {"apple", "anger", "monks", "stink"};

    System.out.println(Arrays.toString(wordsRotationCc(w)));
  }

  private static String[] wordsRotationCc(String[] w) {

    String[] r = new String[w[0].length()];
    for (int i = 0; i < w.length; i++) {
      for (int j = 0, k = 0; j < r.length; j++, k--) {
        r[j] = r[j] + w[i].charAt(i);
      }
    }
    return r;
  }
}
