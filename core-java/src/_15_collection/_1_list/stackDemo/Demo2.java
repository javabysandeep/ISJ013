package _15_collection._1_list.stackDemo;

import java.util.Stack;

public class Demo2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("Search 20 :  "+stack.search(200));
    }
}
