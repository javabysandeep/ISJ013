package _11_array._12_string;

public class Demo1ToUpperCase {
    public static void main(String[] args) {
        //to uppercase
        char[] array = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'a' && array[i] <= 'z') {
                array[i] = (char) (array[i] - 32);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
