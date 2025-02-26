package _6_class_components._5_nestedClases;

public class Demo1 {

    //1. static nested classes
    static class A {
        //
    }

    //2. non-static nested class - inner class
    class B {
        //static int b = 200;
    }

    public static void main(String[] args) {
        //3. local inner class
        class C {
            int a;
        }

        C c = new C();
        System.out.println(c.a);
    }


}
