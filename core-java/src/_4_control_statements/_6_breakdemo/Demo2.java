package _4_control_statements._6_breakdemo;

public class Demo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i % 11 == 0) {
                break;
            }
        }
        // 0 % 11 ---> 0
        //output:
            //0
    }
}
