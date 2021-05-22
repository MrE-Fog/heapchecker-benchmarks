public class newV {
    public newV left;

    public newV right;

    int content;

    public static void snippet(newV t, int x) {
        if (t != null) {
            if ((t.right == t.left) && (t.left != null)) {
                t.left.content = x;
            }
        }
    }

}