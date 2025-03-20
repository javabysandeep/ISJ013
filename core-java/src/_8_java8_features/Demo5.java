package _8_java8_features;

public class Demo5 {
    public static void main(String[] args) {
        interface UserService {
            public static void count(){
                System.out.println("counting");
            }
        }

        //static method will be called using interface name
        UserService.count();

    }
}
