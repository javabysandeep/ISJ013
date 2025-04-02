package _12_string_handling;

public class Demo16StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello World");
        builder.append("!");
        System.out.println(builder);
        builder.append("!");
        System.out.println(builder);
        builder.insert(0, "Java ");
        System.out.println(builder);
        builder.delete(3, 6);
        System.out.println(builder);

    }
}
