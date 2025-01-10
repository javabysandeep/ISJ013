package _3_operators._5_increment_decrement;

public class Demo2 {
    public static void main(String[] args) {
        int a = 1;
        int b = a++; // b = 1; a = 2
        System.out.println("a = " + a);//2
        System.out.println("b = " + b);//1


        int c = 5;
        int d = c--; // d = 5; c = 4
        System.out.println("c = " + c);//4
        System.out.println("d = " + d);//5
    }
}
