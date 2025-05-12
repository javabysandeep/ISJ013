package _16_file_handling.reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1FileInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("isj012-file-handling.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int value = fileInputStream.read();
        //end of file, read method returns -1
        while (value != -1) {
            System.out.print((char) value);
            value = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
