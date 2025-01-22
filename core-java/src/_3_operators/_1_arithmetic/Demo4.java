package _3_operators._1_arithmetic;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(99 / 100);//Q = 0
        System.out.println(99 % 100);//R = 99
        System.out.println(1 % 11);//1
        System.out.println(11 / 2);//5
        System.out.println(11 % 2);//1

        System.out.println('A' + 'A');//130
        System.out.println('A' + 10);//75

        System.out.println(10 + 30 % 2 / 1 + 10);//20
        System.out.println(10 + 30 % (2 / 1) + 10);//20
        System.out.println(10 + 30 % 2 / (1 + 10));//10


    }
}
