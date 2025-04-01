package _12_string_handling;

public class Demo8Case {
    public static void main(String[] args) {
        //toUpperCase
        String s1 = "Hello World";
        s1.toUpperCase();
        System.out.println(s1); //Hello World

        String s2 = "Hello World";
        s2 = s2.toUpperCase();
        System.out.println(s2); //HELLO WORLD


        s2 = s2.toLowerCase();
        System.out.println(s2);//hello world


    }
}
