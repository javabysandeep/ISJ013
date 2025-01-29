package _4_control_statements._8_returnDemo;

public class Demo1 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            if (i % 11 == 0) {
                return;
            }
        }
        System.out.println("rest of the main");
        //output
            //1 to 11
    }
}
