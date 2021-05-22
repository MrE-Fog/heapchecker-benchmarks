public class newV {
    public newV left;

    public newV right;

    int content;

    public static void snippet(newV t, int x) {
        if (t != null) {
            t.right = t.left;
            if (t.right != null) {
                t.right.content = x;
            }
        }
    }

}