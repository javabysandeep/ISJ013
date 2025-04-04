package _13_exception_handling;

public class Demo12 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
            System.out.println(10 / 0);
            int[] array = {};
            System.out.println(array[0]);
        }
        catch (Exception e) {
            System.out.println("generic exception handler");
        }
        catch (ArithmeticException e) {
            System.out.println("invalid denominator");
        } catch (NullPointerException e) {
            System.out.println("null pointer");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("invalid index");
        }

    }
}
