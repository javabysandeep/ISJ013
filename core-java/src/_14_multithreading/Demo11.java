package _14_multithreading;

public class Demo11 {
    public static void main(String[] args) {
        //way 02 - implementing Runnable
        Runnable worker = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + "\t" + Thread.currentThread().getName());
                }
            }
        };
        Thread thread = new Thread(worker);
        thread.start();

        System.out.println("main method");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + Thread.currentThread().getName());
        }

    }
}
