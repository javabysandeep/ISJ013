package _4_control_statements._5_doWhileDemos;

public class Demo1 {
    public static void main(String[] args) {
        boolean flag = false;
        for(;flag;){
            System.out.println("for loop");
        }
        while (flag){
            System.out.println("while loop");
        }

        do{
            System.out.println("do while loop");
        }while (flag);
    }
}
