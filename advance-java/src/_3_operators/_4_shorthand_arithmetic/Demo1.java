package _3_operators._4_shorthand_arithmetic;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        // a = a + 20; //30
        a += 20; // shorthand arithmetic


        int b = 10;
        //b = b - 5; //5
        b -= 5;

        int c = 20;
        //c = c * 2; //40
        c *= 2;

        int d = 100;
        //d = d / 5; //20
        d /= 5;

        int e = 121;
        //e = e % 12; //1
        e %= 12;


        System.out.println("a = " + a);//30
        System.out.println("b = " + b);//5
        System.out.println("c = " + c);//40
        System.out.println("d = " + d);//20
        System.out.println("e = " + e);//1

    }
}
