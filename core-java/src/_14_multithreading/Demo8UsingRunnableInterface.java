package _14_multithreading;

public class Demo8UsingRunnableInterface {
    public static void main(String[] args) {
        Runnable runnable = new Worker()::run;
        Thread thread = new Thread(runnable);
        thread.setName("worker");
        thread.start();
    }
}
