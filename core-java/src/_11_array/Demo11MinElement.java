package _11_array;

public class Demo11MinElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int minValue = Integer.MAX_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
            }
        }
        System.out.println(minValue);
    }
}
