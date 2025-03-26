package _11_array;

public class Demo2 {
    public static void main(String[] args) {

        //NegativeArraySizeException
        int[] array1 = new int[-1];
        int[] array2 = {};

        //float[] array3 = new float[10L];
        int[] array3 = new int['A'];//65

    }
}
