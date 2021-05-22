public class oldV {
    public oldV left;

    public oldV right;

    public int content;

    public static void snippet(oldV t, int x) {
        if ((x >= 0) && (x < 4)) {
            if (t != null) {
                t.content = x;
                snippet(t.left, x - 1);
                snippet(t.right, x - 1);
            }
        }
    }

    public static void wrapper(oldV t, int x) {
        oldV.snippet(t, x);
    }

    public static void entry() {
        oldV.wrapper(null, 0);
    }
}