package _13_exception_handling;

public class Demo13 {
    public static void main(String[] args) {
        System.out.println(divide(100, 0));
    }

    private static int divide(int number1, int number2) {
        int division = -1;
        try {
            division = number1 / number2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return division;
    }
}
