package _12_string_handling;

public class Demo9Replace {
    public static void main(String[] args) {
        String str = "april is the start of new Financial Year";
        str.replace('a', '@');
        System.out.println(str);//april is the start of new Financial Year

        String str2 = "april is the start of new Financial Year";
        str2 = str2.replace('a', '@');
        System.out.println(str2);//@pril is the st@rt of new Fin@nci@l Ye@r
    }
}
