package _4_control_statements._3_forDemos;

public class Demo16 {
    public static void main(String[] args) {
        //print even numbers  in a range
        int start = 1;
        int end = 100;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


    }
}
