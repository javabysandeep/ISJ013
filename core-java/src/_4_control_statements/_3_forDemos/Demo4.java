package _4_control_statements._3_forDemos;

public class Demo4 {
    public static void main(String[] args) {
        for (; 4 > 3; ) {
            System.out.println("for body");
        }
        //System.out.println("rest of the main method");//CTE --> Unreachable Error
        //infinite
    }
}
