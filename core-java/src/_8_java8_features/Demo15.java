package _8_java8_features;

import java.util.function.Function;

public class Demo15 {
    public static void main(String[] args) {
        Function<String, Integer> function = (String str) -> {
            return str.length();
        };
        System.out.println("String length is "+function.apply("IT Shaala"));
    }
}
