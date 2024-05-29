package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ExceptionsDemo {
    public static void show() {
        // sayHello(null);
        try {
            FileReader fileReader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
