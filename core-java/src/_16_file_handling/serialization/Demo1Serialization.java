package _16_file_handling.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1Serialization {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee(1, "Kunal", 21, 90000);
        File file = new File("employee-details.txt");
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee);
        oos.close();
        fos.close();
        System.out.println("Employee details saved");
    }
}
