package _16_file_handling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo2CreateFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\sande\\OneDrive\\Documents\\temp\\demo1.txt";
        File file = new File(path);
        System.out.println("Is file created " + file.createNewFile());
    }
}
