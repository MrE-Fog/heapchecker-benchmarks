public class oldV {
    int x;

    oldV left;

    oldV right;

    public static oldV snippet(int x) {
        if (x == 0) {
            return new oldV(0, null, null);
        } else if (x < 0) {
            return new oldV(x, null, null);
        } else {
            oldV t1 = new oldV(x - 1, null, null);
            oldV t2 = new oldV(x - 1, null, null);
            return new oldV(x, t2, t1);
        }
    }

    public oldV(int x, oldV l, oldV r) {
        this.x = x;
        left = l;
        right = r;
    }

}