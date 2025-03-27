package _11_array;

public class Demo19MultiDimensional {
    public static void main(String[] args) {
        String[][] array = {
                {},
                {"a", "b"},
                {"c", "d", "e"},
        };
        System.out.println(array);//hashCode
        System.out.println(array[0]);//hashCode
        System.out.println(array[1]);//hashCode
        System.out.println(array[2]);//hashCode

        String[][] array2 = new String[2][2];
        System.out.println(array2[0][0]);//null
        System.out.println(array2[0][1]);//null
        System.out.println(array2[1][0]);//null
        System.out.println(array2[1][1]);//null
    }
}
