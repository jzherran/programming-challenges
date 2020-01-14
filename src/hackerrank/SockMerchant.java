package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {

  static int sockMerchant(final int n, final int[] ar) {
    final HashMap<Integer, Integer> socksQuantity = new HashMap<>();

    Arrays.stream(ar).forEach(key -> {
      if (socksQuantity.containsKey(key)) {
        socksQuantity.replace(key, socksQuantity.get(key) + 1);
      } else {
        socksQuantity.put(key, 1);
      }
    });

    return socksQuantity.values().stream().mapToInt((final Integer value) -> value / 2).sum();
  }

  public static void main(final String[] args) {
    final Scanner in = new Scanner(System.in);
    final int n = in.nextInt();
    final int[] ar = new int[n];
    for (int ar_i = 0; ar_i < n; ar_i++) {
      ar[ar_i] = in.nextInt();
    }
    final int result = sockMerchant(n, ar);
    System.out.println(result);
    in.close();
  }
}
