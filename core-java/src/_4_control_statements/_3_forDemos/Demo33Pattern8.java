package _4_control_statements._3_forDemos;

public class Demo33Pattern8 {
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
            //spaces
            for (int space = 5-row; space >=1 ; space--) {
                System.out.print(" ");
            }
            //stars
            for (int star = row; star >=row ; star++) {
                System.out.print("* ");
            }
            //new line
            System.out.println();
        }

        //lower triangle
        int i = 1;
        for (int row = 1; row <=4 ; row++) {
            //spaces
            for (int space = 1; space<=row ; space++) {
                System.out.print(" ");
            }

            //stars
            for (int star = 4; star >=1 ; star--) {
                System.out.print("* ");
            }
            //new line
            System.out.println();
        }


    }
}
