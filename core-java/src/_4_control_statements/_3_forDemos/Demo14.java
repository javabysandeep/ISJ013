package _4_control_statements._3_forDemos;

public class Demo14 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        for (; left < right; left++, right--){
            System.out.println(left + "\t" + right);
        }
        //output :
        //0 10
        //1 9
        //2 8
        // 3 7
        //4 6

    }
}
