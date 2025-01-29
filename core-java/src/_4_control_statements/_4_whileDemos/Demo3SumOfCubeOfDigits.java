package _4_control_statements._4_whileDemos;

public class Demo3SumOfCubeOfDigits {
    public static void main(String[] args) {
        int number = 153;
        //find the sum cube of digits
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit*digit*digit;
            number = number / 10;
        }
        System.out.println("sum of cube of digits is " + sum);

    }
}
