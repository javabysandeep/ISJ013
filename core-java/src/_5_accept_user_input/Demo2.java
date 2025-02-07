package _5_accept_user_input;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //1. create the Scanner class object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Addition of two numbers : " + (number1 + number2));
    }
}
