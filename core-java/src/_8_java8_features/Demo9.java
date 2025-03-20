package _8_java8_features;

public class Demo9 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface Runnable {
            void run();

            default void display(){
                System.out.println("display - functional interface");
            }
        }
        //1. traditional way
        class Worker implements Runnable {
            @Override
            public void run() {
                System.out.println("running - traditional way");
            }
        }
        Runnable worker = new Worker();
        worker.run();

        //2. Anonymous class
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("running - anonymous way");
            }
        };
        anonymous.run();

        //3. lambda expression
        Runnable lambda = () -> {
            System.out.println("running - anonymous way");
        };
        lambda.run();
    }
}
