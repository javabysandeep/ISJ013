package _11_array;

import java.util.Arrays;
import java.util.HashSet;

public class Demo28Duplicate {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 9, 20};

        HashSet<Integer> set = new HashSet<>();//container which stores unique values.
        for (int i = 0; i < array.length; i++) {
            boolean add = set.add(array[i]);
            if (!add) {
                System.out.println("Duplicate found " + i);
            }
        }
    }
}
