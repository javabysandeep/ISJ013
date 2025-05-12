package _16_file_handling.fileClass;

import java.io.File;

public class Demo12FileObjectsListing {
    public static void main(String[] args) {
        String path = "C:\\Work\\ISJ013\\core-java\\src\\_14_multithreading";
        File dir = new File(path);
        //getting all the file objects
        File[] files = dir.listFiles();
        for (File temp : files) {
            System.out.println(temp.getName() + "\t" + temp.length());
        }
    }
}
