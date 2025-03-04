package _7_oops.inheritance;

public class Demo1 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.customerId = 101;
        savingsAccount.accountNumber = 1122;
        savingsAccount.accountHolderName = "Sainath";
        savingsAccount.balance = 10000;

        savingsAccount.withdraw(100);
        System.out.println("Current balance " + savingsAccount.checkBalance());

    }
}
