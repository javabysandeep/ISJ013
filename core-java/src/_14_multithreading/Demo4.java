package _14_multithreading;

public class Demo4 {
    public static void main(String[] args) {
        Thread even = new Thread() {
            public void run() {
                for (int i = 2; i <= 100; i = i + 2) {
                    System.out.println(i + "\t" + Thread.currentThread().getName());
                }
            }
        };
        even.setName("even");
        even.setPriority(Thread.MAX_PRIORITY);

        Thread odd = new Thread() {
            public void run() {
                for (int i = 1; i <= 100; i = i + 2) {
                    System.out.println(i + "\t" + Thread.currentThread().getName());
                }
            }
        };
        odd.setName("odd");

        even.start();
        odd.start();
    }
}
