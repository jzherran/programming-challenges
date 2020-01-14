package hackerrank;

public class LeastSignificantBit {

    public static void main(final String[] args) {
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
