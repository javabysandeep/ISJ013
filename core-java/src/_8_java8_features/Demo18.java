package _8_java8_features;

import java.util.function.BiFunction;

public class Demo18 {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();
        System.out.println(biFunction.apply("hi", "hello"));//7
    }
}
