package _13_exception_handling;

public class Demo5 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("Rest of the try");
        } catch (NullPointerException nullPointerException) {
            System.out.println("NPE");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        }
        System.out.println("rest of the main");
    }
}
