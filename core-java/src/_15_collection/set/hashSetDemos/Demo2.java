package _15_collection.set.hashSetDemos;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        //retrieve elements
        // System.out.println(set.get);//get method is not there
        //use forEach
        for (Object temp : set) {
            System.out.println(temp);
        }

    }
}
