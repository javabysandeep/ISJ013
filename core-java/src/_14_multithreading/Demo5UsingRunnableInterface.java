package _14_multithreading;

public class Demo5UsingRunnableInterface {
    public static void main(String[] args) {
        class Worker implements Runnable {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + "\t" + Thread.currentThread().getName());
                }
            }
        }
        Worker worker = new Worker();
        Thread thread = new Thread(worker);
        thread.setName("worker");
        thread.start();
    }
}
