package hackerrank;

import java.util.Scanner;

public class JavaLoops {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int r = a;
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                r += new Double(Math.pow(new Double(2), new Double(j))).intValue() * b;
                sb.append(j == (n - 1) ? r+"" : r+" ");
            }
            System.out.println(sb.toString());
        }
        in.close();
    }
}
