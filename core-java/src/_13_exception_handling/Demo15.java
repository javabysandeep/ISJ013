package _13_exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo15 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream =
                new FileInputStream("abc.txt");
        System.out.println("rest of the main");
    }
}
