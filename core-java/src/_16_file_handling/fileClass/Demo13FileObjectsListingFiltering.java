package _16_file_handling.fileClass;

import java.io.File;
import java.io.FileFilter;

public class Demo13FileObjectsListingFiltering {
    public static void main(String[] args) {
        String path = "C:\\Work\\ISJ013\\core-java\\src\\_14_multithreading";
        File dir = new File(path);
        //getting few file objects based on some filter
        FileFilter filter = x -> x.length() > 1000;
        File[] files = dir.listFiles(filter);
        for (File temp : files) {
            System.out.println(temp.getName() + "\t" + temp.length());
        }
    }
}
