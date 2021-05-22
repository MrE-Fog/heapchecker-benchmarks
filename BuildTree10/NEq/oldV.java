public class oldV {
    public oldV left;

    public oldV right;

    public int x;

    public oldV(int x, oldV l, oldV r) {
        this.x = x;
        left = l;
        right = r;
    }

    public static oldV snippet(int x) {
        if ((x >= (-1)) && (x < 9)) {
            if (x <= 0) {
                return new oldV(x, null, null);
            } else {
                return new oldV(x, snippet(x - 1), snippet(x - 1));
            }
        }
        return null;
    }

}