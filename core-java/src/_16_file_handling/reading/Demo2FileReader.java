package _16_file_handling.reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo2FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("isj012-file-handling.txt");
        FileReader fileReader = new FileReader(file);
        int value = fileReader.read();
        //end of file, read method returns -1
        while (value != -1) {
            System.out.print((char) value);
            value = fileReader.read();
        }
        fileReader.close();
    }
}
