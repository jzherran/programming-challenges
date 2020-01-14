package hackerrank;

import java.util.Scanner;

public class FormingMagicSquare {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s[i][j] = in.nextInt();
            }
        }

        System.out.println(formingMagicSquare(s));
        in.close();
    }

    static int formingMagicSquare(int[][] s) {

        int[] totals = new int[6];

        for (int i = 0, k = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                totals[k] += 1;
                totals[k + 2] += 1;
            }
        }

        return 0;
    }
}

/**
 4   9   2 = 15
 3   5   7 = 15
 8   1   5 = 14
 |   |   |
 15  15  14

 4   8   2 = 14
 4   5   7 = 16
 6   1   6 = 13
 |   |   |
 14  14  15
 */
