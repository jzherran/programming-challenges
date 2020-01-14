package hackerrank;

import java.util.Scanner;

public class ArraysDS {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        String r = "";

        for (int i = n; i > 0; i--) {
            final int a = sc.nextInt();
            r = ((i==0?a:a+" ")) + r;
        }

        System.out.println(r);
        sc.close();
    }
}
