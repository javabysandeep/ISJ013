package _4_control_statements._3_forDemos;

public class Demo34Pattern9 {
    public static void main(String[] args) {
        /*

            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *
         */
        //upper triangle
        for (int row = 1; row <=5 ; row++) {

            for (int space = 5-row; space >=1; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <=row ; star++) {
                System.out.print(" *");
            }

            System.out.println();
        }

        //lower triangle
        for (int row = 4; row >=1 ; row--) {

            for (int space = 1; space <=5-row; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <=row ; star++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
