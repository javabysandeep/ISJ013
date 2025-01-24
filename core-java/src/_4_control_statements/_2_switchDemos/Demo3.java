package _4_control_statements._2_switchDemos;

public class Demo3 {
    public static void main(String[] args) {
        int value = 12;
        String result = switch (value) {
            case 1 -> "one";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "four";
            case 5 -> "Five";
            default -> "invalid number";
        };
        System.out.println(result);
    }
}
