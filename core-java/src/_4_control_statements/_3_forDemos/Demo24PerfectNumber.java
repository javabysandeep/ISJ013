package _4_control_statements._3_forDemos;

public class Demo24PerfectNumber {
    public static void main(String[] args) {
        //perfect number ----> sum of factors = given number
        int number = 6;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(number == sum ? "perfect =  "+sum : "not a perfect");
    }
}
