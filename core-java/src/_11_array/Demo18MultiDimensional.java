package _11_array;

public class Demo18MultiDimensional {
    public static void main(String[] args) {
        int[][] array = {
                {},
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };
        //System.out.println(array[0][0]);//AIOBE
        System.out.println(array[1][0]);//1
        //System.out.println(array[1][1]);////AIOBE
        System.out.println(array[2][0]);//2
        System.out.println(array[2][1]);//3
        System.out.println(array[3][0]);//4
    }
}
