package _8_java8_features;

public class Demo13 {
    public static void main(String[] args) {

        interface Predicate<X> {
            boolean test(X input);
        }

        Predicate<Integer> isEven = (Integer input) -> input % 2 == 0;
        System.out.println("is even test : " + isEven.test(10));//true

        Predicate<String> startsWithA = (String str)->str.startsWith("A");
        System.out.println(startsWithA.test("Abc"));//true
        System.out.println(startsWithA.test("xyz"));//false

    }
}
