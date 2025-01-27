package _4_control_statements._3_forDemos;

public class Demo15 {
    public static void main(String[] args) {
        //print numbers 1 to n
        //find the sum also
        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum = sum + i;
//            sum +=i;
        }
        System.out.println("Sum of n numbers is " + sum);
    }
}
