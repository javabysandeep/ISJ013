package _7_oops.inheritance;

public class Demo8 {
    public static void main(String[] args) {
        class Parent {
            Parent() {
                System.out.println("Parent class:: constructor");
            }
        }

        class Child extends Parent {
            Child() {
                //call the super class constructor
                super();
                System.out.println("Child class:: constructor");
            }
        }

        Child child = new Child();
    }
}
