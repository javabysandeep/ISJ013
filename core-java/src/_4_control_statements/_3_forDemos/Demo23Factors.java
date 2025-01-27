package _4_control_statements._3_forDemos;

public class Demo23Factors {
    public static void main(String[] args) {
        int number = 28;
        //6 ---> 1,2,3
        //28 --> 1,2,4,7, 14
        //100 ---> 1,2,4,5,10,20,25,50
        //5000 ---> 2500
        //10000 --> 5000
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
