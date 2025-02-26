package _6_class_components._5_nestedClases;

public class P {
    int a;

    class Q {
        //only non-static members
        //static members are not allowed in java 8
        int iv = 100;
        //  static int sv = 200;

        void im() {
            System.out.println("Q class :: instance method");
        }

        /*static void sm() {
            System.out.println("Q class :: static method");
        }*/
    }
}
