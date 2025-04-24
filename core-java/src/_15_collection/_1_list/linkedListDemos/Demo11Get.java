package _15_collection._1_list.linkedListDemos;

import java.util.LinkedList;

public class Demo11Get {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        System.out.println(list1.get(0));//10
        System.out.println(list1.get(1));//20
        System.out.println(list1.get(2));//30
        System.out.println(list1.get(3));//40
        System.out.println(list1.get(4));//50
        System.out.println(list1.get(5));//IndexOutOfBoundsException

    }
}
