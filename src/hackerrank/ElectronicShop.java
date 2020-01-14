package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ElectronicShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        Integer[] n = new Integer[sc.nextInt()];
        int[] m = new int[sc.nextInt()];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }

        Arrays.sort(n, Collections.reverseOrder());
        Arrays.sort(m);

        int max = -1;
        for (int i = 0, j = 0; i < n.length; i++) {
            for (; j < m.length; j++) {
                if(n[i] + m[j] > b) break;
                if(n[i] + m[j] > max) max = n[i] + m[j];
            }
        }

        System.out.println(max);
        sc.close();
    }
}
