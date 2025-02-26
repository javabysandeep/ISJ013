package _6_class_components._6_access_specifier.p1;

public class A {
    public int a = 1;
    private int b = 2;
    protected int c = 3;
    int d = 4;

    public static void main(String[] args) {
        A ref = new A();
        System.out.println(ref.a);//public
        System.out.println(ref.b);//private
        System.out.println(ref.c);//protected
        System.out.println(ref.d);//default
    }
}
