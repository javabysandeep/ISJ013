package _6_class_components._5_nestedClases;

public class A {
    static class B {
        //static members and non-static members
        int iv = 100;
        static int sv = 200;

        void im() {
            System.out.println("B class :: instance method");
        }

        static void sm() {
            System.out.println("B class :: static method");
        }
    }
}
