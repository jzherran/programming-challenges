import java.net.MalformedURLException;
import java.util.Arrays;

/**
 * Created by jhonatan.zambrano on 1/19/17.
 */
public class Solution {

  public static void main(String[] args) throws MalformedURLException {
    System.out.println(makeArrayConsecutive2(new int[]{6, 2, 3, 8}));
  }

  static boolean triangularity(int[] sl) {
    Arrays.sort(sl);
    for (int i = 0; i < sl.length-2; i++) {
      if(sl[i]+sl[i+1] > sl[i+2])
        return true;
    }
    return false;
  }

  static int makeArrayConsecutive2(int[] s) {
    Arrays.sort(s);
    int c = 0;
    for(int i = s[0]; i <= s[s.length-1]; i++) {
      c++;
    }
    return c - s.length;
  }

}
