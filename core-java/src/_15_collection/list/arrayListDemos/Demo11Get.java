package _15_collection.list.arrayListDemos;

import java.util.ArrayList;

public class Demo11Get {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
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
