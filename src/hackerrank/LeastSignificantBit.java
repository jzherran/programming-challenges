package hackerrank;

import java.io.IOException;

/**
 * Created by jzherran on 4/11/17.
 */
public class LeastSignificantBit {

    public static void main(String[] args) throws IOException {
        System.out.println(solution(12));
    }

    static int solution(int n) {
        int ans = 1;
        while((n & 1) == 0) {
            n >>= 1;
            ans <<= 1;
        }
        return ans;
    }
}
