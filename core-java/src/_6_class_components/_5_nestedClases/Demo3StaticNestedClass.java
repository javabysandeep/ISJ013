package _6_class_components._5_nestedClases;

public class Demo3StaticNestedClass {

    public static void main(String[] args) {
        //access B class members
        System.out.println("Static variable of B class ::"+A.B.sv);
        A.B.sm();

        // B class object creation and not A class object creation
        A.B b = new A.B();
        System.out.println("instance variable of B class :: "+b.iv);
        b.im();
    }
}
