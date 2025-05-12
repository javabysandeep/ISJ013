package _16_file_handling.writing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1FileOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("isj012-file-handling.txt");
        //by default, it will override the file,
        //if we want to append the content, enable that in the constructor of FOS, true
        FileOutputStream fos = new FileOutputStream(file);
        fos.write('D');
        fos.write('W');
        fos.write('E');
        fos.close();
        System.out.println("Wrote to file");
    }
}
