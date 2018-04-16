package hackerrank;

public class kthBoring {

    public static void main(String [] args) {
        System.out.println(kthBoring(3));
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
