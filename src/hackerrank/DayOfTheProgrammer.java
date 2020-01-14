package hackerrank;

import java.util.Scanner;

public class DayOfTheProgrammer {

  static int[] months = new int [] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  static String solve(int year){
    int t = 0;
    int i = 0;
    while(i < months.length && t + months[i] <= 256) {
      if(i == 1) {
        if (year == 1918) {
          t += 15;
        } else {
          t += (isLeapYear(year) ? 29 : months[i]);
        }
      } else {
        t += months[i];
      }
      i++;
    }

    return String.format("%02d.%02d.%04d", 256 - t, i + 1, year);
  }

  static boolean isLeapYear(int year) {
    if(year < 1918) {
      return year % 4 == 0;
    } else {
      return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int year = in.nextInt();
    String result = solve(year);
    System.out.println(result);
    in.close();
  }
}
