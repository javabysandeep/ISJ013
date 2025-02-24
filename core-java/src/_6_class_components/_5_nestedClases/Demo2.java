package _6_class_components._5_nestedClases;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Static variable from Constant " + Constant.a);
        System.out.println("Mysql db dev credentials");
        System.out.println("username = " + Constant.Mysql.Dev.USERNAME);
        System.out.println("username = " + Constant.Mysql.Dev.PASSWORD);


        System.out.println("Mysql db qa credentials");
        System.out.println("username = " + Constant.Mysql.QA.USERNAME);
        System.out.println("username = " + Constant.Mysql.QA.PASSWORD);

        System.out.println("Mysql db prod credentials");
        System.out.println("username = " + Constant.Mysql.Prod.USERNAME);
        System.out.println("username = " + Constant.Mysql.Prod.PASSWORD);
    }
}
