package _12_string_handling;

public class Demo3 {
    public static void main(String[] args) {
        String s1 = new String("Hello");//heap=01, scp=01
        String s2 = new String("Hello");//heap=01, scp=0
        String s3 = "Hello";//heap=0, scp=0
        //total objects created : heap(02), scp(01) = 03

        System.out.println(s1);//Hello
        System.out.println(s2);//Hello
        System.out.println(s3);//Hello
    }
}
