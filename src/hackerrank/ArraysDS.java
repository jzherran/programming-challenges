package hackerrank;

import java.util.Scanner;

/**
 * Created by jzherran on 5/14/17.
 */
public class ArraysDS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String r = "";

        for (int i = n; i > 0; i--) {
            int a = sc.nextInt();
            r = ((i==0?a:a+" ")) + r;
        }

        System.out.println(r);
    }
}
