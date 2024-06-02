public class GenericList<T extends Number> {
    
    private T[] floatArray = (T[]) new Object[5];
    private int count;

    public T add(T floatItem) {
        return floatArray[count++] = floatItem;
    }

    public T get(int index) {
        return floatArray[index];
    }
}