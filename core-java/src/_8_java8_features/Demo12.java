package _8_java8_features;

public class Demo12 {
    public static void main(String[] args) {
        interface Predicate {
            boolean test(int input);
        }

        Predicate isEven = input -> input % 2 == 0;
        System.out.println("is even test : " + isEven.test(10));//true
        System.out.println("is even test : " + isEven.test(11));//false

    }
}
