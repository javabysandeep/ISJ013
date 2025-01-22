package _3_operators._1_arithmetic;

public class Demo6 {
    public static void main(String[] args) {
        int number = 123;
        System.out.println(number % 10);//3

        number = number / 10; //12
        System.out.println(number % 10);//2

        number = number / 10; //1
        System.out.println(number % 10);//1

        System.out.println(11.0 / 2);//5.5
        System.out.println(11.0 % 2);//1.0
        System.out.println(11.5 / 2);//5.75
        System.out.println(11.5 % 2);//1.5
        System.out.println(12.0 % 2);//0.0

    }
}
