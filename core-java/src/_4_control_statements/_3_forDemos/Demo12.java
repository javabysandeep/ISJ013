package _4_control_statements._3_forDemos;

public class Demo12 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        for (; left < right; right++) {
            System.out.println(left + "\t" + right);
        }
        //output :
        //0 10
        //0 11
        //...
    }
}
