package codefight;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Sudoku2 {

  public static void main(String[] args) {
    System.out.println(sudoku2(new char[][] {
        {'.', '.', '.', '1', '4', '.', '.', '2', '.'},
        {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
        {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
        {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
        {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
        {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
        {'.', '.', '.', '5', '.', '.', '.', '7', '.'}
    }));
  }

  static boolean sudoku2(char[][] grid) {

    // Position i=0 equals to rows, i=1 equals to columns, i=2 equals to squares
    Set[][] counts = IntStream.range(0,3)
        .mapToObj(x -> IntStream.range(0,9)
            .mapToObj(y -> new HashSet())
            .toArray(Set[]::new))
        .toArray(Set[][]::new);

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        char v = grid[i][j];
        if(v != '.') {
          int x = getSquare(i, j);
          if (counts[0][i].contains(v)) return false;
          if (counts[1][j].contains(v)) return false;
          if (counts[2][x].contains(v)) return false;
          else {
            counts[0][i].add(v);
            counts[1][j].add(v);
            counts[2][x].add(v);
          }
        }
      }
    }
    return true;
  }

  static int getSquare(int i, int j) {
    if (i < 3) return (i/3)+(j/3);
    else if (i > 5) return (i/3)+(j/3)+4;
    else return (i/3)+(j/3)+2;
  }
}
