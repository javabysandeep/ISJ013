package _10_object_class;

import _3_operators._9_conditional_operators.Demo2LeapYear;

public class Demo3 {
    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        System.out.println(obj.getClass().getName());
        Demo2LeapYear obj2 = new Demo2LeapYear();
        System.out.println(obj2.getClass().getName());
    }
}
