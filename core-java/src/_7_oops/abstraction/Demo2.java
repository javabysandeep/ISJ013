package _7_oops.abstraction;

public class Demo2 {
    public static void main(String[] args) {
        abstract class A {
            abstract void m1();
        }
        abstract class B extends A {
            abstract void m2();
        }
        class C extends B {
            @Override
            void m1() {
                System.out.println("C::m1 - overridden");
            }

            @Override
            void m2() {
                System.out.println("C::m2 - overridden");
            }

            void m3() {
                System.out.println("C::m3");
            }


        }
        System.out.println("A class reference and C class object");
        A ref = new C();
        ref.m1();
        // ref.m2();//CTE
        // ref.m3();//CTE

        System.out.println("B class reference and C class object");
        B ref2 = new C();
        ref2.m1();
        ref2.m2();
        //ref2.m3();//CTE

        System.out.println("C class reference and C class object");
        C ref3 = new C();
        ref3.m1();
        ref3.m2();
        ref3.m3();

    }
}
