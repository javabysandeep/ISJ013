package _8_java8_features;

import java.util.function.BiPredicate;

public class Demo16 {
    public static void main(String[] args) {
        BiPredicate<String, String> stringTest = (s1, s2) -> s1.equalsIgnoreCase(s2);
        System.out.println(stringTest.test("abc", "abc"));
        System.out.println(stringTest.test("xys", "abc"));
    }
}
