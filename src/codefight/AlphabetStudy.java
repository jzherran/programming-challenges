package codefight;

/**
 * Created by jhonatan.zambrano on 1/5/17.
 */
public class AlphabetStudy {

  public static void main(String[] args) {

    System.out.println(AlphabetStudy("act", "cat"));
  }

  static String AlphabetStudy(String letters, String word) {
    for (int i = 0; i < word.length(); i++) {
      if (!letters.contains(word.charAt(i) + "")) {
        return "No";
      }
    }
    return "Yes";
  }
}
