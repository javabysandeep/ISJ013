package _7_oops.inheritance;

public class Demo7 {
    public static void main(String[] args) {
        class A {
            A() {
                super();
                System.out.println("A::con");
            }

            {
                System.out.println("A::instance block");
            }

            static {
                System.out.println("A::static block");
            }
        }

        class B extends A {
            B() {
                super();
                System.out.println("B::con");
            }

            {
                System.out.println("B::instance block");
            }

            static {
                System.out.println("B::static block");
            }
        }

        B b = new B();
    }
}
