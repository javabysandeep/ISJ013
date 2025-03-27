package _11_array;

public class Demo12SecondMax {
    public static void main(String[] args) {
        int[] array = {84, 87, 81, 80, 86, 74, 82, 84, 84, 86, 81, 68, 91, 88};
        int firstTopper = Integer.MIN_VALUE;
        int secondTopper = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstTopper) {
                secondTopper = firstTopper;
                firstTopper = array[i];
            }
            if (array[i] > secondTopper && array[i] < firstTopper) {
                secondTopper = array[i];
            }
        }
        System.out.println("First topper: " + firstTopper);
        System.out.println("Second topper: " + secondTopper);
    }
}
