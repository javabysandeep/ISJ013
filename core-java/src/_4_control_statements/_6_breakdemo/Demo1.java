package _4_control_statements._6_breakdemo;

public class Demo1 {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("for body");
            break;
        }
        //break;//CTE
        System.out.println("rest of the main");
        //output
            //for body
            //rest of the main
    }
}
