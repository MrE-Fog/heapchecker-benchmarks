public class oldV {
    public oldV next;

    public int content;

    public static void snippet(oldV list, int x) {
        for (int i = 0; i < 10; i++) {
            if (list == null) {
                return;
            }
            list.content = x;
            list = list.next;
        }
    }

}