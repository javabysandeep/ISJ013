package _13_exception_handling;

public class Demo11 {
    public static void main(String[] args) {
        try {
            String str = "null";
            System.out.println(str.length());
            System.out.println(10 / 2);
            int[] array = {};
            System.out.println(array[0]);
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("invalid denominator");
            }
            if (e instanceof NullPointerException) {
                System.out.println("null reference");
            }
            if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("invalid index");
            }
        }

    }
}
