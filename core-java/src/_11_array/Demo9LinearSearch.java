package _11_array;

public class Demo9LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int x = 50;
        boolean found = false;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == x) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "element found" : "element not found");


    }
}
