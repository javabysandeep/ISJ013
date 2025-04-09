package _14_multithreading;

public class Demo6UsingRunnableInterface {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + "\t" + Thread.currentThread().getName());
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.setName("worker");
        thread.start();
    }
}
