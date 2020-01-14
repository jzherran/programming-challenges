package codesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ubachi {

  public static void main(String[] args) {
    System.out.println(ubachiCalculation("cufintxo r esritqdeucltnagecse.ue raaiS mt", "pancake"));
    System.out.println(ubachiCalculation("oet lfal ee tdc", "zebra"));
  }

  static String ubachiCalculation(String message, String keyword) {

    char[][] charsIter1 = parseMessageToMatrix(message, keyword);
    message = getMessageMatrix(charsIter1);
    char[][] charsIter2 = parseMessageToMatrix(message, keyword);
    return getMessageMatrix(charsIter2);
  }

  private static char[][] parseMessageToMatrix(String message, String keyword) {
    final char[] letters = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
        'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    Map<Character, List<Integer>> keyMap = new HashMap<>();
    char[] keyChars = keyword.toCharArray();
    int[] letterUbachi = new int[keyword.length()];
    char[][] messageMatrix = new char[(int) Math.ceil(message.length() / keyword.length())][keyword.length()];

    for (int j = 0, k = 0; j < messageMatrix[0].length; j++) {
      for (int i = 0; i < messageMatrix.length; i++, k++) {
        messageMatrix[i][j] = message.charAt(k);
      }
    }
    for (int i = 0; i < keyChars.length; i++) {
      List<Integer> integers = keyMap.get(keyChars[i]);
      if (integers != null) {
        keyMap.get(keyChars[i]).add(i);
      } else {
        keyMap.put(keyChars[i], new ArrayList<>(Arrays.asList(i)));
      }
    }
    for (int i = 0, k = 1; i < letters.length; i++) {
      List<Integer> index = keyMap.get(letters[i]);
      if (index != null) {
        for (int in : index) {
          letterUbachi[in] = k;
          k++;
        }
      }
    }
    messageMatrix = orderColumns(messageMatrix, letterUbachi);
    return messageMatrix;
  }

  static String getMessageMatrix(char[][] m) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[0].length; j++) {
        sb.append(m[i][j]);
      }
    }
    return sb.toString();
  }

  static char[][] orderColumns(char[][] m, int[] order) {
    char[][] a = new char[m.length][m[0].length];
    for (int i = 0; i < order.length; i++) {
      for (int j = 0; j < m.length; j++) {
        a[j][i] = m[j][order[i] - 1];
      }
    }
    return a;
  }
}
