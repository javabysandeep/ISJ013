package _14_multithreading;

public class Demo14 {
    public static void main(String[] args) {
        //setting the names of Threads
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "\t" + Thread.currentThread().getName());
            }
        };
        //kaam, naam
        Thread thread = new Thread(runnable, "worker");
        //thread.setName("worker");
       // thread.setPriority(11);//IllegalArgumentException
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
    }
}
