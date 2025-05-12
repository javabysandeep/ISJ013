package _16_file_handling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo1CreateFile {
    public static void main(String[] args) throws IOException {
        //file will be created inside the same folder.
        //file class object creation does not mean file or folder will be created.
        File file  = new File("isj012-file-handling.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("Is new file created? " + isFileCreated);

    }
}
