import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Vestigium {

  static int grid[][] = new int[1005][1005];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int k = 1; k <= T; k++) {

      int n = sc.nextInt();
      long trace = 0;

      List<Set<Integer>> row = initList(n + 1);
      List<Set<Integer>> col = initList(n + 1);

      for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= n; ++j) {
          grid[i][j] = sc.nextInt();
          row.get(i).add(grid[i][j]);
          col.get(j).add(grid[i][j]);
          if (i == j)
            trace += grid[i][j];
        }
      }

      int badRows = 0, badCols = 0;

      for (int r = 1; r <= n; ++r) {
        if (row.get(r).size() != n)
          ++badRows;
        if (col.get(r).size() != n)
          ++badCols;
      }

      System.out.print(String.format("Case #%d: %d %d %d\n", k, trace, badRows, badCols));
    }

    sc.close();
  }

  private static List<Set<Integer>> initList(int n) {
    List<Set<Integer>> l = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      l.add(new HashSet<>());
    }
    return l;
  }
}

/** 
3
4
1 2 3 4
2 1 4 3
3 4 1 2
4 3 2 1
4 
2 2 2 2
2 3 2 3
2 2 2 3
2 2 2 2
3
2 1 3
1 3 2
1 2 3

 */