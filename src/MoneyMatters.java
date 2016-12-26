import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jhonatan.zambrano on 12/6/16.
 */
public class MoneyMatters {

    private static final String IMPOSSIBLE="IMPOSSIBLE";
    private static final String POSSIBLE="POSSIBLE";

    public static void main(String[] args) {

        System.out.println(calculateMatters());
    }

    private static String calculateMatters() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] n_th = new int[n];

        for(int i = 0; i < n; i++) {
            n_th[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++) {
            int p_0 = sc.nextInt();
            int p_1 = sc.nextInt();

            System.out.println(p_0+" ---- "+p_1+" ---- "+Arrays.toString(n_th));

            if( (n_th[p_0] < 0 && n_th[p_1] < 0)
                    || (n_th[p_0] < 0 && n_th[p_1] == 0 )
                    || (n_th[p_0] == 0 && n_th[p_1] < 0) ) return IMPOSSIBLE;
            else if ( n_th[p_0] > 0 && n_th[p_1] <= 0 ) {
                n_th[p_0] = n_th[p_0] - n_th[p_1];
                n_th[p_1] = n_th[p_1] + n_th[p_0];
            } else {
                n_th[p_1] = n_th[p_1] - n_th[p_0];
                n_th[p_0] = n_th[p_0] + n_th[p_1];
            }
        }
        return POSSIBLE;
    }

}
