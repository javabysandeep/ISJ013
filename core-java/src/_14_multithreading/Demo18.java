package _14_multithreading;

public class Demo18 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "\t" + Thread.currentThread().getName() + " " + i);
            }
        }, "custom");
        thread.start();
        System.out.println(10 / 0);
    }
}
