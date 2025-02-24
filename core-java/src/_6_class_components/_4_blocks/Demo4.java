package _6_class_components._4_blocks;

public class Demo4 {

    {
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }

    Demo4(){
        //1.super class constructor or maybe same class constructor
        //2. same class instance block
        super();
        System.out.println("zero param constructor");
    }

    public static void main(String[] args) {
        Demo4 demo4 = new Demo4();
    }
}
