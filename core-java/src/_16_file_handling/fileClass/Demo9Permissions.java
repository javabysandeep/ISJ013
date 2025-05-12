package _16_file_handling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo9Permissions {
    public static void main(String[] args) throws IOException {
        File file = new File("isj012-file-handling.txt");
        System.out.println("File exists: " + file.exists());
        System.out.println("Can we write to the file : "+file.canWrite());


    }
}
