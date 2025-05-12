package _16_file_handling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo4CreateDirectory {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\sande\\OneDrive\\Documents\\temp\\";
        for (int i = 1; i <= 100; i++) {
            File folder = new File(path + "\\" + i);
            folder.mkdir();
        }
        System.out.println("100 Folders created");
    }
}
