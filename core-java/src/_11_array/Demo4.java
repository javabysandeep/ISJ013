package _11_array;

public class Demo4 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        //array reference printing : toString -> hexadecimal hashCode
        System.out.println(array);
        System.out.println(array.toString());
        System.out.println(array[0]);//10
        System.out.println(array[1]);//20
        System.out.println(array[2]);//30
        System.out.println(array[3]);//40
        System.out.println(array[4]);//50
        System.out.println(array[5]);//60
        System.out.println(array[6]);//70
        System.out.println(array[7]);//80
        System.out.println(array[8]);//90
        System.out.println(array[9]);//ArrayIndexOutOfBoundsException
    }
}
