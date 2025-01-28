package _4_control_statements._3_forDemos;

public class Demo26Pattern1 {
    public static void main(String[] args) {
      /*
        *****
        *****
        *****
        *****
        *****

      */
        System.out.println("way 1 : wrong ");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");

        System.out.println("way 2 : wrong ");
        for (int row = 1; row <=5 ; row++) {
            System.out.println("*****");
        }

        System.out.println("way 3 : correct ");
        for (int row = 1; row <=50 ; row++) {
            for (int column = 1; column <=50 ; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
