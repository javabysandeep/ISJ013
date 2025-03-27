package _11_array;

public class Demo15Reverse {
    public static void main(String[] args) {
        int[] array = {10, 30, 40, 50,66, 11, 23};

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
