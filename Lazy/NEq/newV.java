public class newV {
    public newV next;

    public int content;

    public static void snippet(newV list, int x) {
        aux(list, x, 0);
    }

    public static void aux(newV list, int x, int length) {
        if ((list == null) || (length == 10)) {
            return;
        } else {
            list.content = x;
            aux(list, x, length + 1);
        }
    }

}