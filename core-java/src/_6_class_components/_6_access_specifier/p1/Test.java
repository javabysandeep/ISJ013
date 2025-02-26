package _6_class_components._6_access_specifier.p1;

public class Test {
    public static void main(String[] args) {
        A ref = new A();
        System.out.println(ref.a);//public
        //System.out.println(ref.b);//private
        System.out.println(ref.c);//protected
        System.out.println(ref.d);//default
    }
}
