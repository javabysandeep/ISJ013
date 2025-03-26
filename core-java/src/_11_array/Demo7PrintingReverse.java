package _11_array;

public class Demo7PrintingReverse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        //reverse order printing for index : length-1 to 0
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.print(array[index] + " ");
        }

    }
}
