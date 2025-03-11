package _7_oops.polymorphism;

public class Demo1 {
    public static void main(String[] args) {
        class Parent {
            int add(int number1, int number2) {
                return number1 + number2;
            }

            int add(int number1, int number2, int number3) {
                return number1 + number2 + number3;
            }
        }
        class Child extends Parent {
            //method overload
            float add(float number1, float number2) {
                return number1 + number2;
            }
        }

        Child child = new Child();
        System.out.println(child.add(10, 20));
        System.out.println(child.add(10, 20, 30));
        System.out.println(child.add(10.0f, 20.5f));
    }
}
