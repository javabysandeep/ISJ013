package _16_file_handling.fileClass;

import java.io.File;
import java.io.FilenameFilter;

public class Demo11FileNameListingFilter {
    public static void main(String[] args) {
        String path = "C:\\Work\\ISJ013\\core-java\\src\\_14_multithreading";
        File dir = new File(path);
        FilenameFilter filter = (folder, fileName) -> fileName.startsWith("Demo1");
        String[] fileNames = dir.list(filter);
        for (String temp : fileNames) {
            System.out.println(temp);
        }
    }
}
