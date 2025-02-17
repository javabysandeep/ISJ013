package _6_class_components._2_methods;

public class Demo3MethodOverloading {
    public static void main(String[] args) {
        //method call
        System.out.println("Addition is : " + Demo3MethodOverloading.add(100, 200));
        System.out.println("Addition is : " + Demo3MethodOverloading.add(100, 200, 300));
        System.out.println("Addition is : " + Demo3MethodOverloading.add(100.05f, 200));
        System.out.println("Addition is : " + Demo3MethodOverloading.add(100, 200.10f));
        System.out.println("Addition is : " + Demo3MethodOverloading.add(100.50, 200.50));
    }

    //method definition
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static float add(float number1, int number2) {
        return number1 + number2;
    }

    public static float add(int number1, float number2) {
        return number1 + number2;
    }

    public static double add(double number1, double number2) {
        return number1 + number2;
    }
}
