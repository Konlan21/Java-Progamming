import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       
        Compare<Integer, Float> first = new Compare<>(3, 2.1f);
        Boolean result = first.compare(3, 3.5f);
        System.out.println(result);
    } 

}
