package _6_class_components._2_methods;

public class Demo2 {
    public static void main(String[] args) {
        //method call
        System.out.println("Addition is : "+Demo2.add(100, 200));
    }

    //method definition
    public static int add(int number1, int number2) {
        return number1 + number2;
    }
}
