package codesignal;

public class AddDigits {

  public static void main(String[] args) {
    System.out.println(addDigits(12, 11, 2));
    System.out.println(addDigits(4, 13, 10));
    System.out.println(addDigits(5, 13, 10));
    System.out.println(addDigits(4, 3, 9));
    System.out.println(addDigits(412, 11, 4));
  }

  static String addDigits(int a, int b, int n) {
    long ans = a;
    for(int i = 0, j = 9; i < n && j > -1; j--) {
      long num = Long.parseLong(ans+""+j);
      long diff = num % b == 0 ? 0 : num % b;
      if(diff == 0) {
        ans = num;
        j = 10;
        i++;
      } else {
        continue;
      }
    }
    return ans+"";
  }
}
