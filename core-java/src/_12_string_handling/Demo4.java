package _12_string_handling;

public class Demo4 {
    public static void main(String[] args) {
        String s1 = new String("Hello");//heap=01, scp=01
        String s2 = new String("Hello");//heap=01, scp=0
        String s3 = "Hello";//heap=0, scp=0


        System.out.println("equality check by == operator");
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//false
        System.out.println(s2 == s3);//false


        System.out.println("equality check by equals method");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s2.equals(s3));//true
    }
}
