package _14_multithreading;

public class Demo9 {
    public static void main(String[] args) {
        //way 01 - using Thread class
        class Worker extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + "\t" + Thread.currentThread().getName());
                }
            }
        }
        Worker worker = new Worker();
        worker.start();

        System.out.println("main method");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + Thread.currentThread().getName());
        }

    }
}
