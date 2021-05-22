public class oldV {
    public oldV left;

    public oldV right;

    int content;

    public static void snippet(oldV t, int x) {
        if (t != null) {
            t.left = t.right;
            if (t.left != null) {
                t.left.content = x;
            }
        }
    }

}