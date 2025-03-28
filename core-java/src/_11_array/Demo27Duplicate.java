package _11_array;

import java.util.Arrays;

public class Demo27Duplicate {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 9, 20};
        //way 2
        Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == array[i+1]) {
                System.out.println("Duplicate found at index " + i);
                break;
            }
        }
    }
}
