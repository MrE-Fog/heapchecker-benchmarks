public class oldV {
    public oldV left;

    public oldV right;

    int content;

    public static void snippet(oldV t, int x) {
        if (t != null) {
            if ((t.left == t.right) && (t.left != null)) {
                t.left.content = x;
            }
        }
    }

}