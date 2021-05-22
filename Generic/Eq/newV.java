public class newV<T> {
    public newV<T> next;

    public T content;

    public static void snippet(newV<Integer> list, int x) {
        aux(list, x, 0);
    }

    public static void aux(newV<Integer> list, int x, int length) {
        if ((list == null) || (length == 10)) {
            return;
        } else {
            list.content = x;
            aux(list.next, x, length + 1);
        }
    }

}