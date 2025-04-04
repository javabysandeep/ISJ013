package _13_exception_handling;

import java.util.Scanner;

public class Demo19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if (age < 18) {
            try {
                throw new InvalidAgeException("under 18");
            } catch (InvalidAgeException e) {
                System.out.println("Invalid age, please try after completing 18 again");
            }
        } else {
            System.out.println("You are above 18 and eligible to vote");
        }
    }
}
