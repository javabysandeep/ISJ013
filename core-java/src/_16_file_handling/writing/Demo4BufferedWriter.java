package _16_file_handling.writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4BufferedWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("isj012-file-handling.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello World - Buffer");
        bufferedWriter.close();
        fileWriter.close();
        System.out.println("Wrote to file");
    }
}
