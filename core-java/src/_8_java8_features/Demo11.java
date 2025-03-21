package _8_java8_features;

public class Demo11 {
    public static void main(String[] args) {
        interface NumberProcessor {
            int process(int number);
        }
        NumberProcessor square = (int number) -> {
            return number * number;
        };
        System.out.println("square is " + square.process(25));//625


        NumberProcessor cube = number -> number * number * number;
        System.out.println("cube is " + cube.process(25));
    }
}
