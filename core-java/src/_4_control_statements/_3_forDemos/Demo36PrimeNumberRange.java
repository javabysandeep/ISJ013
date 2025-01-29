package _4_control_statements._3_forDemos;

public class Demo36PrimeNumberRange {
    public static void main(String[] args) {

        for (int number = 500; number <= 600; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("its a prime " + number);
            }
        }
    }
}
