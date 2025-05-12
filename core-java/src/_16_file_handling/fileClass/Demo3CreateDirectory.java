package _16_file_handling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo3CreateDirectory {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\sande\\OneDrive\\Documents\\temp\\folder1";
        File folder = new File(path);
        System.out.println("Is folder created " + folder.mkdir());
    }
}
