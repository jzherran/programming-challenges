package codesignal;

import java.util.Arrays;

public class RotateImage {

  public static void main(String[] args) {
    int[][] first = rotateImage(new int[][] {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    });

    for (int[] a: first) {
      System.out.println(Arrays.toString(a));
    }

    int[][] second = rotateImage(new int[][] {
        {1}
    });

    for (int[] a: second) {
      System.out.println(Arrays.toString(a));
    }
  }

  static int[][] rotateImage(int[][] a) {

    int[][] r = new int[a.length][a.length];

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        r[j][i] = a[(a.length-1)-i][j];
      }
    }

    return r;
  }
}
