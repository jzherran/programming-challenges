package hackerrank;

import java.util.Scanner;

public class DesignerPDFViewer {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] h = new int[26];
    for (int h_i = 0; h_i < 26; h_i++) {
      h[h_i] = in.nextInt();
    }
    String word = in.next();
    int m = -1;

    for (char c : word.toCharArray()) {
      m = Integer.max(h[Character.getNumericValue(c) - 10], m);
    }

    System.out.println(m * word.length());
  }
}
