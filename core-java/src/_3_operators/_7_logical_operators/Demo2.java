package _3_operators._7_logical_operators;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(10 % 2 == 0 && 10 % 3 == 0);//false
        System.out.println(2025 % 400 == 0);//false
        System.out.println(2025 % 4 == 0);//false
        System.out.println(2025 % 100 != 0);//true

        System.out.println(
                (2025 % 400 == 0) || (2025 % 4 == 0 && 2025 % 100 != 0)
        );//false

        System.out.println(
                (2024 % 400 == 0) || (2024 % 4 == 0 && 2024 % 100 != 0)
        );//true
    }
}
