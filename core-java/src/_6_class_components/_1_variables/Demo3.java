package _6_class_components._1_variables;

public class Demo3 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        System.out.println(add(number1, number2));//3000
        System.out.println("main " + number1);//100
        System.out.println("main " + number2);//200
    }

    private static int add(int number1, int number2) {
        number1 = 1000;
        number2 = 2000;
        System.out.println("add " + number1);
        System.out.println("add " + number2);
        return number1 + number2;
    }
}
