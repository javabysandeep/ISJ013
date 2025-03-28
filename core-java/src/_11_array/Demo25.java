package _11_array;

public class Demo25 {
    public static void main(String[] args) {
        //array equality
        int[] array1 = {10, 20, 40, 50, 60, 70, 990};
        int[] array2 = {10, 20, 40, 50, 60, 70, 80};
        System.out.println("Array equality check " + equals(array1, array2));
        System.out.println("Array equality check " + equals(array1, null));
        System.out.println("Array equality check " + equals(array1, array1));
        System.out.println("Array equality check " + equals(null, null));

    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
