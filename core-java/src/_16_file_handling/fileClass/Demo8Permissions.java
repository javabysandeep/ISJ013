package _16_file_handling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo8Permissions {
    public static void main(String[] args) throws IOException {
        File file = new File("isj012-file-handling.txt");
        file.setWritable(false);
        System.out.println("file is set to readonly.");


    }
}
