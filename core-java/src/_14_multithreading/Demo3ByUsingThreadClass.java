package _14_multithreading;

public class Demo3ByUsingThreadClass {
    public static void main(String[] args) {
        class Worker extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Worker " + i + "\t" + Thread.currentThread().getName());
                }
            }
        }
        Worker worker = new Worker();
        worker.setName("worker");
        worker.start();

        System.out.println("main method " + Thread.currentThread().getName());
    }
}
