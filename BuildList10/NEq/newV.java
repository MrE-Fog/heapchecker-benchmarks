public class newV {
    public newV next;

    public int content;

    public static newV snippet(int num, int x) {
        if ((x > 0) && (x < 11)) {
            newV nextNode = new newV(num, null);
            newV head = nextNode;
            for (int i = x; i > 0; i--) {
                head = new newV(num, nextNode);
                nextNode = head;
            }
            return head;
        }
        return null;
    }

    public newV(int num, newV next) {
        content = num;
        this.next = next;
    }

}