package _6_class_components._4_blocks;

public class Product {
    static int count = 0;

    {
        System.out.println("instance block1");
    }

    {
        System.out.println("instance block2");
    }
    {
        System.out.println("instance block3");
    }

    static {
        System.out.println("static block1");
    }

    static {
        System.out.println("static block2");
    }
    static {
        System.out.println("static block3");
    }
}
