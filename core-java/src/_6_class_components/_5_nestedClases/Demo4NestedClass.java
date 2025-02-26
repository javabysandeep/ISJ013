package _6_class_components._5_nestedClases;

public class Demo4NestedClass {

    public static void main(String[] args) {
        //access Q class members
        //create the outer class Object
        P pReference = new P();

        //Inner class object creation
        P.Q q = pReference.new Q();

        System.out.println("Instance variable of Q class ::" + q.iv);
        q.im();

    }
}
