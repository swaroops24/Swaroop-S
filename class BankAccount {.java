class BankAccount {
    private String accountNumber;
    private double balance;
    static int accountCount = 0;
    final String accountId;

    BankAccount(String number, double openingBalance) {
        if (openingBalance < 0)
            throw new IllegalArgumentException("Invalid opening balance");
        accountNumber = number;
        balance = openingBalance;
        accountId = "ACC" + (++accountCount);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid withdrawal");
            return;
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("123456", 5000);
        a.deposit(1000);
        a.withdraw(1500);
        System.out.println("Balance = " + a.getBalance());
        System.out.println("Account ID = " + a.accountId);
        System.out.println("Accounts = " + BankAccount.accountCount);
        // System.out.println(a.balance); // Error: balance is private
    }
}
