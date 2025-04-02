package _12_string_handling;

public class Demo19Conversion {
    public static void main(String[] args) {
        String string = "Welcome to String Handling";
        StringBuilder stringBuilder = new StringBuilder(string);
        StringBuffer stringBuffer = new StringBuffer(string);
        System.out.println(string);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
    }
}
