public class newV {
    public newV left;

    public newV right;

    public int x;

    public newV(int x, newV l, newV r) {
        this.x = x;
        left = l;
        right = r;
    }

    public static newV snippet(int x) {
        if ((x >= (-1)) && (x < 9)) {
            if (x == 0) {
                return new newV(0, null, null);
            } else if (x <= 0) {
                return new newV(x, null, null);
            } else {
                newV t = snippet(x - 1);
                return new newV(x, t, t);
            }
        }
        return null;
    }

}