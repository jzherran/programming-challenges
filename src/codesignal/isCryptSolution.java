package codesignal;

import java.util.stream.IntStream;

public class isCryptSolution {

  public static void main(String[] args) {
    System.out.println(isCryptSolution(new String[]{"MMMMMMMMMMMMMM", "O", "O"},
        new char[][]{
            {'M', '9'},
            {'O', '0'}
        }));
  }

  static boolean isCryptSolution(String[] crypt, char[][] solution) {

    String[] sumCrypt = IntStream.range(0,3).mapToObj(x -> new String()).toArray(String[]::new);
    for (int i = 0; i < crypt.length; i++) {
      for (char c: crypt[i].toCharArray()) {
        for (int j = 0; j < solution.length; j++) {
          if(c == solution[j][0]) sumCrypt[i] += solution[j][1];
        }
      }
    }

    if((sumCrypt[0].length() > 1 && sumCrypt[0].charAt(0) == '0')
        || (sumCrypt[1].length() > 1 && sumCrypt[1].charAt(0) == '0')
        || (sumCrypt[2].length() > 1 && sumCrypt[2].charAt(0) == '0'))
      return false;

    return (Long.parseLong(sumCrypt[0]) + Long.parseLong(sumCrypt[1])
        == Long.parseLong(sumCrypt[2]));
  }
}
