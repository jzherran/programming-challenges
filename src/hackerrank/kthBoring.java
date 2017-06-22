package hackerrank;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jzherran on 3/1/17.
 */
public class kthBoring {

    public static void main(String [] args) {
        //System.out.println(hackerrank.kthBoring(3));
        //System.out.println(f(28657) + " " + p(28657));
        System.out.println(17711*17711*5 + " " + Integer.MAX_VALUE);
    }

    static int kthBoring(int k) {
        int r = 0, i = 1;
        while(true) {
            if(!p(i) && !f(i)) {
                r++;
                if(r == k) return i;
            }
            i++;
        }
    }

    static boolean s (int x) {
        int s = (int) Math.sqrt(x);
        return s*s == x;
    }

    static boolean f (int y) {
        return s(5*y*y + 4) || s(5*y*y - 4);
    }

    static boolean p(int n) {
        int sqrt = (int) Math.sqrt(n) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        } return true;
    }
}
