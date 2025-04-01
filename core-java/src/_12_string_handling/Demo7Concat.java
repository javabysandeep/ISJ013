package _12_string_handling;

public class Demo7Concat {
    public static void main(String[] args) {
        String str = "good ";
        str.concat("morning");//new object
        System.out.println(str);//good


        String str2 = "good";
        str2 = str2.concat(" morning");
        System.out.println(str2);//good morning
      //  System.out.println(str2.concat(" morning"));//good morning
    }
}
