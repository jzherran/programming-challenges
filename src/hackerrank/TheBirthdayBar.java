package hackerrank;

import java.util.Scanner;

public class TheBirthdayBar {

    static int getWays(int[] squares, int d, int m){
        // Complete this function
        int r = 0;
        for (int i = 0; i <= squares.length - m; i++) {
            int s = 0;
            for (int j = i; j < (i + m); j++) {
                s += squares[j];
            }
            if(s == d)
                r++;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
