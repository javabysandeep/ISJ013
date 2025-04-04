package _13_exception_handling;

public class Demo7 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");
    }
}
//output
//finally block
//ArithmeticException / zero
