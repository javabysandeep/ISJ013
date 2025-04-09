package _14_multithreading;

public class Demo1 {
    public static void main(String[] args) {
        //01. traditional way
        class Worker implements Runnable {
            @Override
            public void run() {
                System.out.println("Working---traditional way");
            }
        }
        Runnable worker = new Worker();
        worker.run();

        //way 02 : anonymous class
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("Working---anonymous way");
            }
        };
        anonymous.run();

        //way 03 : anonymous class
        Runnable lambda = () -> System.out.println("Working---lambda way");
        lambda.run();

        //way 04 : Method reference
        Runnable reference = new Demo1()::display;
        reference.run();
    }

    public static void print() {
        System.out.println("working");
    }

    public void display() {
        System.out.println("working");
    }

    Demo1() {
        System.out.println("demo1::constructor");
    }
}
