package _12_string_handling;

public class Demo14Split {
    public static void main(String[] args) {
        String str = "rahul,sainath,gunajirao,rahul";
        String[] strings = str.split(",");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
