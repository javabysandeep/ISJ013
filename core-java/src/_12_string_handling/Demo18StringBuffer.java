package _12_string_handling;

public class Demo18StringBuffer {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello World");
        buffer.append("!");
        System.out.println(buffer);
        buffer.append("!");
        System.out.println(buffer);
        buffer.insert(0, "Java ");
        System.out.println(buffer);
        buffer.delete(3, 6);
        System.out.println(buffer);

    }
}
