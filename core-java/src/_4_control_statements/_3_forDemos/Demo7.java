package _4_control_statements._3_forDemos;

public class Demo7 {
    public static void main(String[] args) {
        boolean flag = true;
        for (System.out.println("init");flag; System.out.println("incr/decr") ) {
            System.out.println("for body");
        }
        //output
        //init
        // for body infinitely , incr/decr
    }
}
