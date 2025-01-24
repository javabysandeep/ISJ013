package _4_control_statements._1_if_else;

public class Demo10 {
    public static void main(String[] args) {
       int[] array = {10,30,40,11,89,23};
       int max = Integer.MIN_VALUE;
       int secondMax = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            if(max < array[index]){
                secondMax = max;
                max = array[index];
            }
            if(secondMax <array[index] && array[index]< max){
                secondMax = array[index];
            }
        }
        System.out.println("max "+max);
        System.out.println("second max "+secondMax);

    }
}
