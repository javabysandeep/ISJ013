package _8_java8_features;

public class Demo10 {
    public static void main(String[] args) {
        interface A {
            void m1();
        }
        A a = () -> System.out.println("m1");
        a.m1();


        interface B {
            void m2(int a);
        }
        B b = x -> System.out.println("m2 " + x);
        b.m2(10);


        interface C {
            int m3();
        }
        //C c = ()->{return 3;};
        C c = () -> 3;
        System.out.println(c.m3());


        interface D {
            int m4(int number);
        }
        D d = x -> x * x;
        System.out.println(d.m4(10));//100
    }
}
