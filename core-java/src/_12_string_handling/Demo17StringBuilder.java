package _12_string_handling;

public class Demo17StringBuilder {
    public static void main(String[] args) {
        //StringBuilder stringBuilder = "";//CTE : literal way is not supported
        StringBuilder stringBuilder = new StringBuilder("Good morning");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
