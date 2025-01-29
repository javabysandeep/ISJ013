package _4_control_statements._4_whileDemos;

public class Demo4Armstrong {
    public static void main(String[] args) {

        //Armstrong = {sum of cube of digits = given number}
        // 1 ^3 + 5^3 + 3^3 = 1 + 125 + 27 ---> 153
        int number = 153;
        int originalNumber = number;
        //find the sum cube of digits
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit*digit*digit;
            number = number / 10;
        }
        System.out.println("sum of cube of digits is " + sum);
        System.out.println(originalNumber==sum?"Armstrong":"not armstrong");

    }
}
