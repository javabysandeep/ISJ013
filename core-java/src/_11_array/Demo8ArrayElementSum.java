package _11_array;

public class Demo8ArrayElementSum {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
           // sum = sum + array[i];
        }
        System.out.println("Sum of elements in array: " + sum);

    }
}
