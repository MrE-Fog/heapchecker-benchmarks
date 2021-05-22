public class oldV {
    oldV next;

    int content;

    public static void snippet(oldV list, int num, int x) {
        if ((x >= 0) && (x < 6)) {
            for (int i = 0; i < x; i++) {
                if (list == null) {
                    return;
                }
                list.content = num;
                list = list.next;
            }
        }
    }

}
