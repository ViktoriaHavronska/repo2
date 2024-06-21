package task_10;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    // Публічний метод для внесення грошей на рахунок
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Публічний метод для зняття грошей з рахунку
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }

}
