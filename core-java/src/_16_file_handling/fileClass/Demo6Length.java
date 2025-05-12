package _16_file_handling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo6Length {
    public static void main(String[] args) throws IOException {
        File file = new File("isj012-file-handling.txt");
        System.out.println("File size " + file.length());

    }
}
