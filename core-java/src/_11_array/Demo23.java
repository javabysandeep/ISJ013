package _11_array;

public class Demo23 {
    public static void main(String[] args) {
        int[] array1 = {10, 30, 40, 50, 60, 80, 90};

        //this is not array copy. this is only reference copy
        //both the references are pointing to the same object
        //int[] array2 = array1;
        //int[] array2 = array1.clone();
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println("printing array 2");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
