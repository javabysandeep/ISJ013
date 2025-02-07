package _5_accept_user_input;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        //1. create the Scanner class object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter byte value");
        byte byteValue = scanner.nextByte();

        System.out.println("Enter short value");
        short shortValue = scanner.nextShort();

        System.out.println("Enter int value");
        int intValue = scanner.nextInt();

        System.out.println("Enter long value");
        long longValue = scanner.nextLong();

        System.out.println("Enter float value");
        float floatValue = scanner.nextFloat();

        System.out.println("Enter double value");
        double doubleValue = scanner.nextDouble();

        System.out.println("Enter boolean value");
        boolean booleanValue = scanner.nextBoolean();

        System.out.println("Enter String value");
        String singleString = scanner.next();

        System.out.println("Enter char value");
        char ch = scanner.next().charAt(0);

        System.out.println("************* printing *******************");
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);
        System.out.println(singleString);
        System.out.println(ch);
    }
}
