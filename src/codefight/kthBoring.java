package codefight;

/**
 * Created by jhonatan.zambrano on 3/1/17.
 */
public class kthBoring {

    public static void main(String[] args) {
        //System.out.println(kthBoring(2));

        //System.out.println(p(4)+" "+f(6));
    }

    static boolean s (int x) {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    static boolean f (int y) {
        return s(5*y*y + 4) || s(5*y*y - 4);
    }

    static boolean p (int z) {
        if(z <= 1) return false;
        else if(z <= 3) return true;
        else if(z % 2 == 0 || z % 3 == 0) return false;
        for (int i = 5; i <= z; i=i+6)
            if(z % i == 0 || z % (i+2) == 0) return false;
        return true;
    }
}
