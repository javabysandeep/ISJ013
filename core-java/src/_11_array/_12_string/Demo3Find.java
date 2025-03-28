package _11_array._12_string;

public class Demo3Find {
    public static void main(String[] args) {
        //find
        char[] array = {'G', 'O', 'O', 'D', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
        char x = 'c';
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "found" : "not found");

    }
}
