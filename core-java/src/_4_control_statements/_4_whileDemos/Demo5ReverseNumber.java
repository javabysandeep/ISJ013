package _4_control_statements._4_whileDemos;

public class Demo5ReverseNumber {
    public static void main(String[] args) {
        int number = 123;
        //321
        int rev = 0;
        while (number > 0) {
            int digit = number % 10; //1
            rev = rev * 10 + digit; //32*10 + 1 --> 321
            number = number / 10; //0
        }
        System.out.println("Reverse number is " + rev);
    }
}
