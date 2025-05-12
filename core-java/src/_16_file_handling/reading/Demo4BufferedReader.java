package _16_file_handling.reading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo4BufferedReader {
    public static void main(String[] args) throws IOException {
        File file = new File("isj012-file-handling.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int value = bufferedReader.read();
        //end of file, read method returns -1
        while (value != -1) {
            System.out.print((char) value);
            value = bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();
    }
}
