package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {

  static int sockMerchant(int n, int[] ar) {
    HashMap<Integer, Integer> socksQuantity = new HashMap<>();

    Arrays.stream(ar).forEach(key -> {
      if(socksQuantity.containsKey(key)) {
        socksQuantity.replace(key, socksQuantity.get(key) + 1);
      } else {
        socksQuantity.put(key, 1);
      }
    });

    return socksQuantity.values().stream().mapToInt((Integer value) -> value / 2).sum();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] ar = new int[n];
    for(int ar_i = 0; ar_i < n; ar_i++){
      ar[ar_i] = in.nextInt();
    }
    int result = sockMerchant(n, ar);
    System.out.println(result);
  }
}
