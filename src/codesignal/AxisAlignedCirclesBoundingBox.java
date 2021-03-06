package codesignal;

public class AxisAlignedCirclesBoundingBox {

    public static void main(final String[] args) {
        final int[] x = new int[] { 1, 0, 4 };
        final int[] y = new int[] { -1, 2, 2 };
        final int[] r = new int[] { 3, 5, 4 };
        System.out.println(axisAlignedCirclesBoundingBox(x, y, r));
    }

    public static int axisAlignedCirclesBoundingBox(final int x[], final int y[], final int r[]) {
        // up down left right
        final int[] c = new int[4];
        for(int i = 0; i < r.length; i++) {
            if(y[i] + r[i] > c[0]) {
                c[0] = y[i] + r[i];
            }
            if(y[i] - r[i] < c[1]) {
                c[1] = y[i] - r[i];
            }
            if(x[i] + r[i] > c[2]) {
                c[2] = x[i] + r[i];
            }
            if(x[i] - r[i] < c[3]) {
                c[3] = x[i] - r[i];
            }
        }
        return (Math.abs(c[0]) + Math.abs(c[1])) * (Math.abs(c[2]) + Math.abs(c[3]));
    }
}
