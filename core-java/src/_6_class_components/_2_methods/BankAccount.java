package _6_class_components._2_methods;

public class BankAccount {
    public int accountNumber;
    public double balance;
    public static String bankName = "Bank of Mallya";

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

        //calling static method from instance method within the same class
        BankAccount.printBankAddress();
        printBankAddress();
        this.printBankAddress();

        //calling instance method from another instance method within the same class
        checkBalance();
        this.checkBalance();



    }

    public double checkBalance() {
        return 0;
    }

    public static void printBankAddress() {
        System.out.println("Bank Address");
    }

    public static void main(String[] args) {

        //calling instance methods from static method within the same class
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw(10);
        bankAccount.deposit(10);
        bankAccount.checkBalance();

        //calling static method from static method within the same class
        BankAccount.printBankAddress();
        printBankAddress();
        bankAccount.printBankAddress();
    }
}
