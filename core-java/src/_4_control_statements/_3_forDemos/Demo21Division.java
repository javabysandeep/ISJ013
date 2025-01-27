package _4_control_statements._3_forDemos;

public class Demo21Division {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 20;
        int quotient = 0;

        //Quotient = 5
        //Remainder = 0
        for (; number1 >= number2; ) {
            number1 = number1 - number2;
            quotient++;
        }
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + number1);
    }
}
