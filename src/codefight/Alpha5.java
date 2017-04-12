package codefight;

/**
 * Created by jhonatan.zambrano on 12/16/16.
 */
public class Alpha5 {

    public static void main(String[] args) {
        //System.out.println(alpha5("yahoo"));
        //System.out.println((int)'o');
        //System.out.println((char)97);
        //System.out.println((433/26));

        int n = 6;

        int ans = 1;
       /* while ((n & 1) == 0) {
            n = n & 1;
            ans++;
            System.out.println(n+ " " + ans + " " + (n & 1));
        }*/
        System.out.println(n ^ 1);

        System.out.println(ans);
    }

    static char alpha5(String s) {
        int n = 0;
        for (char c: s.toCharArray())
            n += (int)c - 97;
        return Character.toUpperCase((char)((n%26)+ 97));
    }
}
