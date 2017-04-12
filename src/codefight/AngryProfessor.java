package codefight;

import java.util.*;

/**
 * @author <a href="mailto:jhonatan.zambrano@payulatam.com">Jhonatan A. Zambrano</a>
 *         29/9/2016
 */
public class AngryProfessor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        while (T > 0) {
            String[] line = sc.nextLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int K = Integer.parseInt(line[1]);
            List<Integer> a = new ArrayList<>();

            line = sc.nextLine().split(" ");
            int min = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                int e = Integer.parseInt(line[i]);
                a.add(e);
                if(e <= 0) min = Math.max(min, e);
            }
            a.sort((o1, o2) -> {
                if(o1 < o2) return -1;
                else if(o1 > o2) return 1;
                return 0;
            });
            T-=1;
            System.out.println(((a.lastIndexOf(min) + 1) >= K ? "NO" : "YES"));
        }
    }
}
