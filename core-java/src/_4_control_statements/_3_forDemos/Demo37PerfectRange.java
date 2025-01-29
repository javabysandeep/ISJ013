package _4_control_statements._3_forDemos;

public class Demo37PerfectRange {
    public static void main(String[] args) {
        //perfect number = {sum of factors = given number}
        for (int number = 1; number <= 10000; number++) {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == number) {
                System.out.println("Perfect number  " + number);
            }
        }

    }
}
