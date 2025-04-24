package _15_collection._1_list.arrayListDemos;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Demo14IterateForEachMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //Consumer - functional interface -->void accept(object)
        //consumer impl --> traditional, anonymous, lambda, method reference
        Consumer<Integer> consumer = input ->System.out.println(input);
        //forEach method internally calls accept method[number of elements]
        list.forEach(consumer);

    }
}
