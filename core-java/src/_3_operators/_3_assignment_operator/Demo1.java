package _3_operators._3_assignment_operator;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10 * 10;
        int c = b;
        int d = add(100, 200);
        System.out.println("a = " + a);//a = 10
        System.out.println("b = " + b);//b = 100
        System.out.println("c = " + c);//c= 100
        System.out.println("d = " + d);//d = 300

        System.out.println(d = 1000);//1000
        //System.out.println(10=10);//CTE
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }
}
