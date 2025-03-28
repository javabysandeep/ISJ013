package _11_array;

public class Demo26Duplicate {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 9, 20};
        //way 1
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    System.out.println("duplicate found " + array[i] + " " + array[j]);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
    }
}
