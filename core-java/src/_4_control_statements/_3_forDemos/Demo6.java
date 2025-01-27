package _4_control_statements._3_forDemos;

public class Demo6 {
    public static void main(String[] args) {
        boolean flag = true;
        for (; flag; ) {
            System.out.println("for body");
            flag = false;
        }
        System.out.println("rest of the main method");
        //output
        // for body
        //rest of the main method
    }
}
