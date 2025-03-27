package _11_array;

public class Demo22 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transpose = new int[matrix.length][matrix[0].length];

        /*
            1 4 7

        * */


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                // {1, 2, 3},
                transpose[row][col] = matrix[col][row];
            }
        }

        System.out.println("Transpose:");
        for (int row = 0; row < transpose.length; row++) {
            for (int col = 0; col < transpose[row].length; col++) {
                System.out.print(transpose[row][col] + " ");
            }
            System.out.println();
        }

    }
}
