package _14_multithreading;

public class Demo17 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(5000);
        }
    }
}
