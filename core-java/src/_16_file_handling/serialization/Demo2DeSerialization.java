package _16_file_handling.serialization;

import java.io.*;

public class Demo2DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("employee-details.txt");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee employee = (Employee) ois.readObject();
        ois.close();
        fis.close();
        System.out.println(employee);

    }
}
