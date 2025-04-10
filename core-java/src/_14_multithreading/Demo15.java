package _14_multithreading;

public class Demo15 {
    public static void main(String[] args) throws InterruptedException {
        Thread even = new Thread(() -> {
            for (int i = 2; i <= 50; i = i + 2) {
                System.out.println(i + "\t" + Thread.currentThread().getName());
            }
        }, "even");
        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 50; i = i + 2) {
                System.out.println(i + "\t" + Thread.currentThread().getName());
            }
        }, "odd");
        even.start();
        odd.start();


        even.join();
        odd.join();

        System.out.println("main method " + Thread.currentThread().getName());
    }
}
