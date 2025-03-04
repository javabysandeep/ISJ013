package _7_oops.inheritance;

public class Demo2 {
    public static void main(String[] args) {
        interface I1{

        }
        interface I2{

        }

        //multiple inheritance is supported through interface
        class C implements I1,I2{}
    }
}
