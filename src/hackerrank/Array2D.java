package hackerrank;

import java.util.Scanner;

/**
 * Created by jzherran on 5/14/17.
 */
public class Array2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] h = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                h[i][j] = sc.nextInt();
            }
        }

        int m = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m = Integer.max(h[i][j] + h[i][j+1] + h[i][j+2] + h[i+1][j+1]
                        + h[i+2][j] + h[i+2][j+1] + h[i+2][j+2], m);
            }
        }

        System.out.println(m);
    }
}
