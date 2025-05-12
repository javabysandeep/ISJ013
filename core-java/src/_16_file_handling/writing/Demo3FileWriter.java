package _16_file_handling.writing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3FileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("isj012-file-handling.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Hello World - file handling");
        fileWriter.close();
        System.out.println("Wrote to file");
    }
}
