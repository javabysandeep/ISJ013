package _12_string_handling;

public class Demo5 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("ABC");

        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equalsIgnoreCase(str2));//true

    }
}
