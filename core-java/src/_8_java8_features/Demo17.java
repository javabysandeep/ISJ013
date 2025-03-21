package _8_java8_features;

import java.util.function.Consumer;

public class Demo17 {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println("Entered string is " + str);
        consumer.accept("hello world");
    }
}
