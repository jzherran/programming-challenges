package codesignal;

public class Canonical2DHash {

  public static void main(String[] args) {
    canonical2DHash(541440);
  }

  static int canonical2DHash(int part) {

    int[][] artBoard = new int[5][5];
    String partBinary = Integer.toBinaryString(part);

    for (int i = 0, n = 0; i < 5 && n < partBinary.length(); i++) {
      for (int j = 0; j < 5; j++) {
        if(partBinary.charAt(n) == '1') artBoard[i][j] = 1;
        n++;
      }
    }
    return 0;
  }
}
