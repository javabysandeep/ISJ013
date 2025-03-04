package _7_oops.inheritance;

public class Demo13 {
    public static void main(String[] args) {
        class A {
            int a = 1;

            void m1() {
                System.out.println("A::m1");
            }
        }

        class B extends A {
            int a = 10;
            int b = 20;

            void m1() {
                System.out.println("B::m1");
            }
            void m2() {
                System.out.println("B::m2");
            }
        }

        class C extends B {
            int a = 100;
            int b = 200;
            int c = 300;

            void m1() {
                System.out.println("C::m1");
            }
            void m2() {
                System.out.println("C::m2");
            }
            void m3() {
                System.out.println("C::m3");
            }
        }

        //only from A class
        A a = new A();
        System.out.println(a.a);
        a.m1();


        A ab = new B();
        System.out.println(ab.a);//A::a
        ab.m1();
       // ab.m2();//CTE
       // ab.m3();//CTE

        A ac = new C();
        System.out.println(ac.a);
        ac.m1();

        B bc = new C();
        System.out.println(bc.a);
        System.out.println(bc.b);
        //System.out.println(bc.c);//CTE
        bc.m1();
        bc.m2();
        //bc.m3();//CTE
    }
}
