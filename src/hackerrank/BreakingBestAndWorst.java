package hackerrank;

import java.util.Scanner;

public class BreakingBestAndWorst {

    static int[] getRecord(int[] s){
        // Complete this function
        int[] r = new int[]{0, 0};
        int h = s[0], l = s[0];
        for (int i = 1; i < s.length; i++) {
            if (s[i] > h) {
                h = s[i];
                r[0]++;
            }
            if (s[i] < l) {
                l = s[i];
                r[1]++;
            }
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
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
