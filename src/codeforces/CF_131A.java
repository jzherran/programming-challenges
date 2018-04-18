package codeforces;

import java.util.Scanner;

public class CF_131A {
  public static void main(String[] args) {
    System.out.println(solution());
  }

  public static String solution() {
    Scanner sc = new Scanner(System.in);

    String word = sc.nextLine();
    char[] a = word.toCharArray();
    StringBuilder sb = new StringBuilder();
    int r[] = new int[2];

    for (int i = 0; i < a.length; i++) {
      sb.append(convertCharacter(a[i]));
      if(!isUppercase(a[i])) {
        if (i == 0) {
          r[0]++;
        } else {
          r[1]++;
        }
      }
    }

    sc.close();
    return ((r[0] == 1 && r[1] == 0) || (r[0] == 0 && r[1] == 0) ? sb.toString() : word);
  }

  static boolean isUppercase(int c) {
    if (c > 64 && c < 91) return true;
    else return false;
  }

  static char convertCharacter(int c) {
    if(c > 64 && c < 91) {
      return (char) (c + 32);
    } else if(c > 96 && c < 123) {
      return (char) (c - 32);
    } else return '-';
  }
}
