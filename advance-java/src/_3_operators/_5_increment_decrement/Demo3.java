package _3_operators._5_increment_decrement;

public class Demo3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(a++ + ++b + --a + b++ + ++c + d++ + c--); //20

        System.out.println("a = " + a); //1
        System.out.println("b = " + b); //4
        System.out.println("c = " + c); //3
        System.out.println("d = " + d); //5
    }
}
