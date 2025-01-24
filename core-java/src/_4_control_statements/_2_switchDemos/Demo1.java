package _4_control_statements._2_switchDemos;

public class Demo1 {
    public static void main(String[] args) {
        int value = 4;
        switch (value){
            case 1 : System.out.println("one");break;
            case 2 : System.out.println("Two");break;
            case 3 : System.out.println("Three");break;
            case 4 : System.out.println("four");break;
            case 5 : System.out.println("Five");break;
            default: System.out.println("invalid number");break;
        }
    }
}
