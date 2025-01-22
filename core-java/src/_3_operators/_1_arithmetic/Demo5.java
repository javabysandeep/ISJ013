package _3_operators._1_arithmetic;

public class Demo5 {
    public static void main(String[] args) {
        int number = 456789;
        System.out.println(number % 10);//9
        System.out.println(number = number / 10);//45678


        System.out.println(number % 10);//8
        System.out.println(number = number / 10);//4567


        System.out.println(number % 10);//7
        System.out.println(number = number / 10);//456

        System.out.println(number % 10);//6
        System.out.println(number = number / 10);//45


        System.out.println(number % 10);//5
        System.out.println(number = number / 10);//4

        System.out.println(number % 10);//4
        System.out.println(number = number / 10);//0
    }
}
