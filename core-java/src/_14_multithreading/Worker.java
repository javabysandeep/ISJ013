package _14_multithreading;

class Worker implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + Thread.currentThread().getName());
        }
    }
}