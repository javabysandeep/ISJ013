package _4_control_statements._3_forDemos;

public class Demo31Pattern6 {
    public static void main(String[] args) {
        /*
                *
               **
              ***
             ****
            *****

         */
        for (int row = 1; row <=5 ; row++) {
            //spaces
            for (int space = 5-row; space >=1  ; space--) {
                System.out.print(" ");
            }

            //stars
            for (int star = 1; star <=row ; star++) {
                System.out.print("*");
            }
            //new line
            System.out.println();
        }

    }
}
