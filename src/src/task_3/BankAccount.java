package task_3;

public class BankAccount {

    private final int accountNumber;
    private double balance;

    public BankAccount(int number, double balance) {
        this.accountNumber = number;
        this.balance = balance;
    }

    void deposit(double input) {
        balance += input;
    }

    void withdraw(double withdrawal) {
        balance -= withdrawal;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

}
