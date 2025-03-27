package _11_array;

public class Demo13SecondMin {
    public static void main(String[] args) {
        int[] array = {84, 87, 81, 80, 86, 74, 82, 84, 84, 86, 81, 68, 91, 88};
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < firstMin) {
                secondMin = firstMin;
                firstMin = array[i];
            }
            if (array[i] < secondMin && array[i] > firstMin) {
                secondMin = array[i];
            }
        }
        System.out.println("First Min: " + firstMin);
        System.out.println("Second Min: " + secondMin);
    }
}
