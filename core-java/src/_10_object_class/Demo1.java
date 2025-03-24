package _10_object_class;

public class Demo1 {
    public static void main(String[] args) {
        class A {}

        class B extends A {}

        A a = new A();
        a.hashCode();

        B b = new B();
        b.hashCode();
    }
}
