package codefight;

/**
 * @author jzherran@gmail
 * @date 3/24/17
 */
public class ConsecutiveBit {

  public static void main(String[] args) {
    System.out.println(consecutiveBit(337));
  }

  public static boolean consecutiveBit(int num) {

    String s = Integer.toString(num, 2);
    System.out.println(s);
    char lc = '.';
    for (char a: s.toCharArray()) {
      if(a == lc && a == '1') {
        return true;
      }
      lc = a;
    }
    return false;
  }
}
