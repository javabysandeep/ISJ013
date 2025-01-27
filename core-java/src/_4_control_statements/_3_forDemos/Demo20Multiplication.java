package _4_control_statements._3_forDemos;

public class Demo20Multiplication {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 4;
        //System.out.println("multiplication =  " + number1 * number2);
        int multiplication = 0;
        for (int i = 1; i <= number1; i++) {
            multiplication = multiplication + number2;
        }
        System.out.println("multiplication is = "+multiplication);

    }
}
