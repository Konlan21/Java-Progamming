public class Compare<K, V> {
    public K first;
    public V second;

    public Compare(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public Boolean compare(K first, V second) {
        return first == second; 
    }
}


