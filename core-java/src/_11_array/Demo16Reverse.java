package _11_array;

public class Demo16Reverse {
    public static void main(String[] args) {
        char[] array = {'I', 'Y', 'A', 'S', 'C', 'D', 'F'};//

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            char temp = array[left];
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
