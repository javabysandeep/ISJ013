package _8_java8_features;

public class Demo20 {

    Demo20(){}

    Demo20(String str){
        System.out.println(str);
    }

    void m1(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        interface A {
            void m1(String str);
        }
        A a = str -> System.out.println(str);
        a.m1("good morning");


        A ref = System.out::println;
        ref.m1("good afternoon");


        A ref2 = Demo20::new;
        ref2.m1("string using constructor reference");


        Demo20 demo20 = new Demo20();
        A ref3 = demo20::m1;
        ref3.m1("non static method reference");

    }
}
