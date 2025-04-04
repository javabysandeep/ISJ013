package _13_exception_handling;

public class Demo16 {
    public static void main(String[] args) {
        try {
            m1();
        }catch (ArithmeticException e) {
            System.out.println("divide by zero");
        }
    }

    private static void m1() {
        m2();
    }

    private static void m2() {
      m3();
    }

    private static void m3() {
        System.out.println(10 / 0);
    }
}
