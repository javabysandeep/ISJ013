package _14_multithreading;

public class Demo19 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println(divide(100, 0)), "custom");
        thread.start();
        System.out.println("Division is " + divide(100, 2));
    }

    public static int divide(int number1, int number2) {
        return number1 / number2;
    }
}
