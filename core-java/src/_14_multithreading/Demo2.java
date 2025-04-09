package _14_multithreading;

public class Demo2 {
    public static void main(String[] args) {
        Thread currentlyExecutingThread = Thread.currentThread();
        System.out.println(currentlyExecutingThread.getName());
        System.out.println("main method");
    }
}
