import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jhonatan.zambrano on 1/19/17.
 */
public class Solution {

  public static void main(String[] args) throws MalformedURLException {
    //System.out.println(makeArrayConsecutive2(new int[]{6, 2, 3, 8}));

    StringTokenizer st = new StringTokenizer("/transfers-api/.*/transfers/?$,/transfers-api/.*/transfers.*\\\\?.*", ",");

    while (st.hasMoreTokens()) {
      Pattern pattern = Pattern.compile(st.nextToken());

      final Matcher matcher = pattern.matcher("/hermes/transfers-api/api/transfers/");
      System.out.println(matcher.find());
    }
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
