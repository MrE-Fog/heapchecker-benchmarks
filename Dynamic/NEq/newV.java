public class newV {
    int x;

    newV left;

    newV right;

    public static newV snippet(int x) {
        if (x == 0) {
            return new newV(0, null, null);
        } else if (x < 0) {
            return new newV(x, null, null);
        } else {
            newV t1 = new newV(x - 1, null, null);
            newV t2 = new newV(x - 1, null, null);
            return new newV(x, t1, t1);
        }
    }

    public newV(int x, newV l, newV r) {
        this.x = x;
        left = l;
        right = r;
    }

}