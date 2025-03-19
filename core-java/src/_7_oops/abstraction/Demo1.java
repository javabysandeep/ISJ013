package _7_oops.abstraction;

public class Demo1 {
    public static void main(String[] args) {
        class A {
            void m1() {
            }
            //abstract void m2();//CTE
        }

        abstract class B {
            //components
            int a = 100;
            static int b = 200;

            void m2() {
                System.out.println("B::m2 instance method");
            }

            static void m3() {
                System.out.println("B::m3 static method");
            }

            B() {
                System.out.println("B::constructor");
            }

            {
                System.out.println("B::instance block");
            }

            static {
                System.out.println("B:: static block");
            }

            abstract void m1();
        }
        // B b = new B();//CTE -abstract class or interface cannot be instantiated
        class C extends B {
            @Override
            void m1() {
                System.out.println("C::m1 -overridden");
            }
        }

        C c = new C();
        System.out.println("B class instance variable : " + c.a);
        System.out.println("B class static variable" + B.b);
        c.m1();//C::m1 - overridden
        c.m2();//B:m2
        B.m3();//B::m3



        //output:
        // static block of B
        // instance block of B
        // Constructor of B
        //B class instance variable
        //B class static variable
        //C::m1
        //B:m2
        //B:m3
    }
}
