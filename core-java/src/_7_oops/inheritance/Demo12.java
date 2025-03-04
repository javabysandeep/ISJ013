package _7_oops.inheritance;

public class Demo12 {
    public static void main(String[] args) {
        class Parent {
            int a = 1;
            int b = 2;

            void m1() {
                System.out.println("m1 from Parent class");
            }

            void m2() {
                System.out.println("m2 from Parent class");
            }
        }
        class Child extends Parent {
            int a = 10;
            int b = 20;
            int c = 30;

            void m1() {
                System.out.println("m1 from child class");
            }

            void m3() {
                System.out.println("m3 from child class");
            }

        }

        Parent pc = new Child();
        System.out.println(pc.a);//variable present in both : access it from parent
        System.out.println(pc.b);//variable present in both : access it from parent
        //System.out.println(pc.c);//present in only Child :CTE
        pc.m1();//method present in both : access it from child
        pc.m2();////method present in Parent : access it from Parent
        //pc.m3();//present in only Child :CTE
    }
}

