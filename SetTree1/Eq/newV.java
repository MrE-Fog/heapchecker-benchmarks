public class newV {
    public newV left;

    public newV right;

    public int content;

    public static void snippet(newV t, int x) {
        if ((x >= 0) && (x < 2)) {
            if (t != null) {
                snippet(t.right, x - 1);
                snippet(t.left, x - 1);
                t.content = x;
            }
        }
    }

}