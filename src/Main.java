import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GenericList<String> studentList = new GenericList<>();
        studentList.add("Konlan");
        studentList.add("Joe");
        String first = studentList.get(0);
        System.out.println(first);
        System.out.println(studentList );

        GenericList<Integer> phoneList = new GenericList<>();
        phoneList.add(0323232323);
        phoneList.add(342343);
        int secondContact = phoneList.get(1);
        System.out.println(secondContact);
        
    } 

}
