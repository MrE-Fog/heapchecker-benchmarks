public class newV {
    newV next;

    int content;

    public static void snippet(newV list, int num, int x) {
        if ((x >= 0) && (x < 6)) {
            if (list != null) {
                for (int i = 0; i < x; i++) {
                    newV elem = list.get(i);
                    if (elem == null) {
                        return;
                    }
                    elem.content = num;
                }
            }
        }
    }

    public newV get(int x) {
        newV current = this;
        for (int i = 0; i < x; i++) {
            if (current == null) {
                return null;
            }
            current = current.next;
        }
        return current;
    }

}
