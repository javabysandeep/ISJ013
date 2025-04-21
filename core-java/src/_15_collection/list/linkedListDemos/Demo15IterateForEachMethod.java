package _15_collection.list.linkedListDemos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Consumer;

public class Demo15IterateForEachMethod {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
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
