package _4_control_statements._3_forDemos;

public class Demo25PrimeNumber {
    public static void main(String[] args) {
        //prime number = number which is only divisible by 1 and number itself.
        //for any given number maximum factor can be half of the given number
        int number = 11;
        boolean isPrime = true;
        for (int i = 2; i <= number/2; i++) {
            int remainder = number % i;
            System.out.println(number + " % "+ i+ " is  = "+remainder);
            if (remainder == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "its prime" : " not a prime");
    }
}
