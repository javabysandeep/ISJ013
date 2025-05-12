package _16_file_handling.fileClass;

import java.io.File;

public class Demo10FileNameListing {
    public static void main(String[] args) {
        String path = "C:\\Work\\ISJ013\\core-java\\src\\_14_multithreading";
        File dir = new File(path);
        String[] allFileNames = dir.list();
        //print all the file names
        for (String temp : allFileNames) {
            System.out.println(temp);
        }
    }
}
