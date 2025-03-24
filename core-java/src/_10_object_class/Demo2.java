package _10_object_class;

import java.lang.reflect.Method;

public class Demo2 {
    public static void main(String[] args) {
        //getClass
        class A {
            public static void m1() {
                System.out.println("A::m1");
            }
        }

        A ref = new A();
        Class<? extends A> aClass = ref.getClass();

        Method[] methods = aClass.getMethods();

        for (Method m : methods) {
            System.out.println(m.getName());
        }

    }
}
