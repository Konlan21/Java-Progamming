public class GenericList<T> {
    private T[] items = (T[]) new Object[4];
    private int count;

    public T  add(T item) {
        return items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}