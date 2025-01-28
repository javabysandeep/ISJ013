package _4_control_statements._3_forDemos;

public class Demo32Pattern7 {
    public static void main(String[] args) {
        /*
         *****
         ****
         ***
         **
         *

         */

        for (int row = 5; row >= 1; row--) {

            for (int space = 0; space <5-row ; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
