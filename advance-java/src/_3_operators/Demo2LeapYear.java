package _3_operators;

public class Demo2LeapYear {
    public static void main(String[] args) {
        int year = 1900;
        //leap year
        //1. year must be divisible by 4
        //2. if year is a century then it must be divisible by 400
        //e.g. leap year --> 2024, 2000, 2400, 2028
        //e.g. not a leap year ---> 2025, 2100, 1900, 2026

        System.out.println(
                (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)

                        ? "its a leap year"

                        : "not a leap year");
    }
}
