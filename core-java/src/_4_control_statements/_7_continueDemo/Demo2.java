package _4_control_statements._7_continueDemo;

public class Demo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 11 == 0) {
                continue;
            }
            System.out.println(i);
        }
        //output:
        //all 11 multiples till 100 will be skipped
        //1,...98 [skip the 11 multiples]
    }
}
