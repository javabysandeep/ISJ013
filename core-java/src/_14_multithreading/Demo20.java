package _14_multithreading;

public class Demo20 {
    public static void main(String[] args) throws InterruptedException {
        class BankAccount {
            int accountNumber;
            String accountHolderName;
            double balance;

            synchronized void deposit(double amount) {
                balance = balance + amount;
            }

            synchronized void withdraw(double amount) {
                balance = balance - amount;
            }

        }
        BankAccount account = new BankAccount();
        account.balance = 1000;

        Thread depositor = new Thread(() -> {
            for (int i = 1; i <= 100000; i++) {
                account.deposit(i);
            }

        }, "depositor");
        Thread withdraw = new Thread(() -> {
            for (int i = 1; i <= 100000; i++) {
                account.withdraw(i);
            }
        }, "withdraw");
        depositor.start();
        withdraw.start();

        depositor.join();
        withdraw.join();

        System.out.println("Balance: " + account.balance);

    }
}
