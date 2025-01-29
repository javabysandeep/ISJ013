package _4_control_statements._3_forDemos;

public class Demo35Factorial {
    public static void main(String[] args) {
        int number = 6;
        //factorial --> 6! = 1 * 2 * 3 * 4 * 5 * 6
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);//720
    }
}
