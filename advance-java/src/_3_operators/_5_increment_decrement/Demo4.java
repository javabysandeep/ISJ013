package _3_operators._5_increment_decrement;

public class Demo4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        //1 + 2 + 3 + 2 + 1 + 4 ==13
        System.out.println(a++ + --c + ++a + b + --b + d++); //13
        System.out.println(a);//3
        System.out.println(b);//1
        System.out.println(c);//2
        System.out.println(d);//5
    }
}
