package _8_java8_features;

public class Demo7 {
    public static void main(String[] args) {
        interface Interface1 {
            void method1();

            default void display() {
                System.out.println("Interface1.display");
            }
        }

        interface Interface2 {
            void method2();

            default void display() {
                System.out.println("Interface2.display");
            }
        }

        class A implements Interface1, Interface2 {

            @Override
            public void method1() {
                System.out.println("Method 1 overridden in A");
            }

            @Override
            public void method2() {
                System.out.println("Method 2 overridden in A");
            }

            @Override
            public void display() {
                //new logic
                Interface1.super.display();
                Interface2.super.display();
            }
        }


        A a = new A();
        a.method1();
        a.method2();
        a.display();
    }
}
