package codesignal;

import java.util.Arrays;

class ArcadeIntro {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(sortByHeight(new int[]{-1, 150, 190, 170, -1, -1, 160, 180})));
        //System.out.println(reverseParentheses("The ((quick (brown) (fox) jumps over the lazy) dog)"));
        //System.out.println(Arrays.toString(alternatingSums(new int[]{50, 60, 60, 45, 70})));
        //System.out.println(Arrays.toString(addBorder(new String[]{"abc", "ded"})));
        System.out.println(areSimilar(new int[]{1, 2, 2}, new int[]{2, 1, 1}));
    }

    static int[] sortByHeight(int[] a) {
        int[] t = Arrays.stream(a).filter(x -> x != -1).sorted().toArray();
        for (int i = 0, j = 0; i < a.length; i++) {
            if(a[i] != -1) {
                a[i] = t[j];
                j++;
            }
        }
        return a;
    }

    static String reverseParentheses(String s) {
        while(s.contains("(") && s.contains(")")) {
            int ob = s.lastIndexOf("(");
            int cb = s.indexOf(")", ob);

            String t = s.substring(ob, cb + 1);
            s = s.replace(t, new StringBuilder(t.substring(1, t.length() - 1)).reverse());
        }
        return s;
    }

    static int[] alternatingSums(int[] a) {
        int[] ans = new int[2];
        for (int i = 0; i < a.length; i++) {
            if(i % 2 != 0) ans[1] += a[i];
            else ans[0] += a[i];
        }
        return ans;
    }

    static String[] addBorder(String[] picture) {
        int max = 0;
        String[] r = new String[picture.length + 2];

        for (int i = 0; i < picture.length; i++) {
            max = Math.max(max, picture[i].length());
            r[i + 1] = new String("*" + picture[i] + "*");
        }

        String t = new String(new char[max + 2]).replace('\0', '*');
        r[0] = t;
        r[r.length-1] = t;

        return r;
    }

    static boolean areSimilar(int[] a, int[] b) {
        int[] ap = new int[]{0, 0};
        int[] bp = new int[]{0, 0};

        for (int i = 0, j = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                if(j > 1) return false;
                ap[j] = a[i];
                bp[j] = b[i];
                j++;
            }
        }

        if(ap[0] != bp[1] || ap[1] != bp[0]) return false;
        return true;
    }

    static int arrayChange(int[] inputArray) {
        return 0;
    }
}
