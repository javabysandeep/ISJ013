package _4_control_statements._3_forDemos;

public class Demo18OddNumbers {
    public static void main(String[] args) {
        //print odd numbers  in a range
        int start = 0;
        int end = 100;
        start = start % 2 != 0 ? start : start + 1;
        for (int i = start; i <= end; i = i + 2) {
            System.out.println(i);
        }
    }
}
