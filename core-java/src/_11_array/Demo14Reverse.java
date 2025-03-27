package _11_array;

public class Demo14Reverse {
    public static void main(String[] args) {
        int[] array = {10, 30, 40, 50, 11, 23};
        //output : {23, 11, 50, 40, 30, 10}

        //1. print from length-1 to 0 ---> this is not the solution
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.print(array[index] + " ");
        }

        System.out.println("using new array");
        //2. not optimal solution : create a new array and push the values from old array from length-1 to 0
        int[] array2 = new int[array.length];
        for (int index = array.length - 1, index2 = 0; index >= 0 && index2 < array2.length; index--, index2++) {
            array2[index2] = array[index];
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

    }
}
