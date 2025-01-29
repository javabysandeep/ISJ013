package _4_control_statements._4_whileDemos;

public class Demo6PalindromeNumber {
    public static void main(String[] args) {
        //palindrome --> given number * its reverse is equals
        int number = 123;
        int originalNumber = number;
        //321
        int rev = 0;
        while (number > 0) {
            int digit = number % 10; //1
            rev = rev * 10 + digit; //32*10 + 1 --> 321
            number = number / 10; //0
        }
        System.out.println("Reverse number is " + rev);
        System.out.println(originalNumber == rev ? "Palindrome" : "not a palindrome");
    }
}
