package _11_array;

public class Demo20 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }


    }
}
