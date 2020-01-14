package codesignal;

public class AlphabetStudy {

  public static void main(String[] args) {
    System.out.println(alphabetStudyCalculation("act", "cat"));
  }

  static String alphabetStudyCalculation(String letters, String word) {
    for (int i = 0; i < word.length(); i++) {
      if (!letters.contains(word.charAt(i) + "")) {
        return "No";
      }
    }
    return "Yes";
  }
}
