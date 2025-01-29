package _4_control_statements._8_returnDemo;

public class Demo3 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 100;
        int addition = add(number1, number2);
        System.out.println("addition is " + addition);
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
        //System.out.println("");//CTE
    }
}
