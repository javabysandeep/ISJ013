package _14_multithreading;

import lombok.SneakyThrows;

public class Demo21 {
    public static void main(String[] args) {
        class Product {
            synchronized void produce() {
                System.out.println("product is produced");
                try {
                    wait(5000);
                } catch (InterruptedException e) {
                    System.out.println("product is interrupted");
                }
                System.out.println("production resume");
            }

            @SneakyThrows
            synchronized void consume() {
                System.out.println("product is consumed");
                notify();
            }
        }
        Product product = new Product();
        Thread producer = new Thread(() -> product.produce(), "producer");
        Thread consumer = new Thread(() -> product.consume(), "consumer");
        producer.start();
        consumer.start();
    }
}
