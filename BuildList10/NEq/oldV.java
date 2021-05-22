public class oldV {
    public oldV next;

    public int content;

    public static oldV snippet(int num, int x) {
        if ((x > 0) && (x < 11)) {
            oldV head = new oldV(num, null);
            oldV list = head;
            for (int i = 1; i < x; i++) {
                list.next = new oldV(num, null);
                list = list.next;
            }
            return head;
        }
        return null;
    }

    public oldV(int num, oldV next) {
        content = num;
        this.next = next;
    }

}