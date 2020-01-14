package hackerrank;

import java.util.Scanner;

public class JavaLoops {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            final int a = in.nextInt();
            final int b = in.nextInt();
            final int n = in.nextInt();

            int r = a;
            final StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                r += new Double(Math.pow(new Double(2), new Double(j))).intValue() * b;
                sb.append(j == (n - 1) ? r+"" : r+" ");
            }
            System.out.println(sb.toString());
        }
        in.close();
    }
}
