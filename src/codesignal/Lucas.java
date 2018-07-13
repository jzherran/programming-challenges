package codesignal;

import java.util.Arrays;

public class Lucas {

  public static void main (String[] args) {
    System.out.println(Arrays.toString(lucas(2, 2, 2)));
  }

  static long[] lucas(int p, int q, int n) {
    if(n == 0) {
      return new long[]{0,2};
    } else {
      long[] bL = lucas(p, q, n-1);
      return new long[]{(p*bL[0]+bL[1])/2,
          (((p*p)-4*q)*bL[0]+p*bL[1])/2};
    }
  }

}
