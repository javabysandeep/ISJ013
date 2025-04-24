package _15_collection._1_list.vectorDemos;

import java.util.Vector;
import java.util.function.Consumer;

public class Demo15IterateForEachMethod {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //Consumer - functional interface -->void accept(object)
        //consumer impl --> traditional, anonymous, lambda, method reference
        Consumer<Integer> consumer = System.out::println;
        //forEach method internally calls accept method[number of elements]
        list.forEach(consumer);
        //list.forEach(System.out::println);

    }
}
