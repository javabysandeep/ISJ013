package _9_final_keyword;

import _6_class_components._5_nestedClases.P;

public class Demo1 {
    public static void main(String[] args) {
        final class A{}
        //class B extends A{}//CTE

        class Parent {
            final void m1(){
                System.out.println("Parent::m1");
            }
        }
        class Child extends Parent{
           /* @Override
            void m1() {
                System.out.println("Child::m1");
            }*/
        }
    }
}
