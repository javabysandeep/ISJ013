package _3_operators._2_string_concatenation;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println('A' + 'A' + "A");//130A
        System.out.println("A" + 'A' + "A"); //AAA
        System.out.println("A" + "A" + 'A');//AAA
        System.out.println("A" + 'A' + 'A');//AAA
        System.out.println(10 + 'A' + "A" + 30);//75A30
        System.out.println(10 + 20 + 'A' + 10 + 'A' + "A");//170A
    }
}
