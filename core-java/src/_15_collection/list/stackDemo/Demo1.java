package _15_collection.list.stackDemo;

import java.util.Stack;

public class Demo1 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("Stack top : " + stack.peek());
        System.out.println("Stack size : " + stack.size());
        System.out.println("Stack pop : " + stack.pop());
        System.out.println("Stack pop : " + stack.pop());
        System.out.println("Stack pop : " + stack.pop());
        System.out.println("Stack pop : " + stack.pop());
        System.out.println("Stack pop : " + stack.pop());
        System.out.println("Stack pop : " + stack.pop());
        System.out.println("After pop : size is : " + stack.size());

      //  System.out.println("Stack pop : " + stack.pop());//

        // {()} ---->true
        // {{) ----> false
        // [{()}] ----> true
        //switch and stack
        System.out.println("Is stack empty " + stack.empty());
    }
}
