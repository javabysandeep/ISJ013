package _13_exception_handling;

public class Demo6 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException e) {
                System.out.println("inner catch");
            }
            System.out.println("rest of the try");
        } catch (ArithmeticException e) {
            System.out.println("outer catch");
        }
        System.out.println("rest of the main");
    }
}
//output :
// inner catch
//rest of the try
//rest of the main
