package geeksforgeeks;

import java.util.Scanner;

public class MaxNumberOfPartitions {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    int[] r = new int[t];

    while (t > 0) {

      int n = sc.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      System.out.println(maxPartitions(arr, n));
      t--;
    }
  }

  static int maxPartitions(int arr[], int n) {
    int ans = 0, max_so_far = 0;
    for (int i = 0; i < n; ++i) {

      // Find maximum in prefix arr[0..i]
      max_so_far = Math.max(max_so_far, arr[i]);

      // If maximum so far is equal to index,
      // we can make a new partition ending at
      // index i.
      if (max_so_far == i)
        ans++;
    }
    return ans;
  }
}

/**
4
4
2 1 0 3
6
2 1 0 3 4 5
25
7 15 6 2 20 0 9 12 16 5 19 13 4 14 24 1 22 11 23 10 3 17 18 8 21
2
0 0

 */