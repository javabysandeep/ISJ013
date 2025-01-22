package _4_control_statements.if_else;

public class Demo9 {
    public static void main(String[] args) {
        //max of three numbers
        int number1 = 10;
        int number2 = 110;
        int number3 = 90;

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
        } else if (number2 > number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }

    }
}
