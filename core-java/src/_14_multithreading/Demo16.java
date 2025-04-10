package _14_multithreading;

public class Demo16 {
    public static void main(String[] args) throws InterruptedException {
        Thread even = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 2; i <= 50; i = i + 2) {
                System.out.println(i + "\t" + Thread.currentThread().getName());
            }
        }, "even");
        even.start();


        even.join(5000);
        Thread.yield();//main is ready to give up the execution for other thread with same or more priority
        System.out.println("main method " + Thread.currentThread().getName());
    }
}
