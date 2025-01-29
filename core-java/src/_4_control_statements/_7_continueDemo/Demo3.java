package _4_control_statements._7_continueDemo;

public class Demo3 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            if (i % 11 == 0) {
                continue;
            }
        }
        System.out.println("rest of the main");
        //output:
        //1,2,3,.,.,99
        //rest of the main
    }
}
