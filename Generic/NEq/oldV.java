public class oldV<T> {
    public oldV<T> next;

    public T content;

    public static void snippet(oldV<Integer> list, int x) {
        for (int i = 0; i < 10; i++) {
            if (list == null) {
                return;
            }
            list.content = x;
            list = list.next;
        }
    }

}