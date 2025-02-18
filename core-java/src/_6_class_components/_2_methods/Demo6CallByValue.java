package _6_class_components._2_methods;

public class Demo6CallByValue {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = 101;
        bankAccount.balance = 1000;
        updateBankAccount(bankAccount);
        System.out.println("main method");
        System.out.println("Account number = " + bankAccount.accountNumber);//1111111
        System.out.println("Account Balance = " + bankAccount.balance);//99999
    }

    private static void updateBankAccount(BankAccount bankAccount) {
        bankAccount.accountNumber = 1111111;
        bankAccount.balance = 99999;
        System.out.println("updateBankAccount method");
        System.out.println("Account number = " + bankAccount.accountNumber);//1111111
        System.out.println("Account Balance = " + bankAccount.balance);//99999
    }


}
