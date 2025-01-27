package _4_control_statements._3_forDemos;

public class Demo5 {
    public static void main(String[] args) {
        boolean flag = false;
        for (;  flag/*4 < 3  CTE*/; ) {
            System.out.println("for body");
        }
        System.out.println("rest of the main method");//CTE --> Unreachable Error
        //infinite
    }
}
