package _4_control_statements._1_if_else;

public class Demo8 {
    public static void main(String[] args) {
        //amazon discounts
        double productPrice = 13000;
        double discount = 0.0;
        String bankOffer = "HDFC";
        if (bankOffer.equals("HDFC")) {
            discount = productPrice * 0.05;
        } else if (bankOffer.equals("ICICI")) {
            discount = productPrice * 0.03;
        } else if (bankOffer.equals("HSBC")) {
            discount = productPrice * 0.01;
        } else if (bankOffer.equals("BOB")) {
            discount = productPrice * 0.06;
        } else if (bankOffer.equals("Bank Of Maharashtra")) {
            discount = productPrice * 0.02;
        }
        System.out.println("Final prices " + (productPrice - discount));
    }
}
