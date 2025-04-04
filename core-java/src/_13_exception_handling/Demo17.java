package _13_exception_handling;

public class Demo17 {
    public static void main(String[] args) {
        //System.out.println(10/0);
        throw new ArithmeticException("/ by zero");
    }
}
