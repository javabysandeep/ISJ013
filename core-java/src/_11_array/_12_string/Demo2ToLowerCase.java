package _11_array._12_string;

public class Demo2ToLowerCase {
    public static void main(String[] args) {
        //to lowercase
        char[] array = {'G', 'O', 'O', 'D', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'A' && array[i] <= 'Z') {
                array[i] = (char) (array[i] + 32);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
