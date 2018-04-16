package hackerrank;

import java.util.Scanner;

public class Duplication {

    static String invert(String n) {
        n = n.replaceAll("0", "x");
        n = n.replaceAll("1", "0");
        n = n.replaceAll("x", "1");
        return n;
    }

    static String duplication(int x){
        String r = "0";
        while(r.length() < x+1) {
            r = r + invert(r);
        }
        return r.charAt(x)+"";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            String result = duplication(x);
            System.out.println(result);
        }
    }
}
