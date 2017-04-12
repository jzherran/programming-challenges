package codeforces;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by jhonatan.zambrano on 2/17/17.
 */
public class Football {

    public static void main (String[] args) {
        System.out.println(football());
    }

    public static String football() {

        Scanner sc = new Scanner(System.in);
        char[] t = sc.nextLine().toCharArray();

        int mt = 0, at = -1;
        for (char c: t) {
            if(c == '0' && (at == 0 || at == -1)) {
                mt++;
            } else if(c == '1'&& (at == 1 || at == -1)) {
                mt++;
            }
        }
        return "";
    }
}
