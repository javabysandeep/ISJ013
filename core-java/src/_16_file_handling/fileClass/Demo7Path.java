package _16_file_handling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo7Path {
    public static void main(String[] args) throws IOException {
        File file = new File("isj012-file-handling.txt");
        System.out.println("File relative path : " + file.getPath());
        System.out.println("File absolute path :" + file.getAbsolutePath());
    }
}
