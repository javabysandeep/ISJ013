package _3_operators._7_logical_operators;

public class Demo1 {
    public static void main(String[] args) {
        //CTE
       /* System.out.println(10 && 3);
        System.out.println(10 && true);
        System.out.println(10 && false);
        System.out.println(10 || false);
        System.out.println(10 || 3);
        System.out.println(!10);*/

        System.out.println("Logical AND");
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && false);//false
        System.out.println(false && true);//false

        System.out.println("Logical OR");
        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || false);//false
        System.out.println(false || true);//true

        System.out.println("Logical NOT");
        System.out.println(!true);//false
        System.out.println(!false);//true

    }
}
