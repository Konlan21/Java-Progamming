package Generics;

public class List {
    private int[] numbers = new int[5];
    private int count;

    public void add(int number){
        numbers[count++] = number;
    }
}
