package task_10;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        account.deposit(500);

        account.withdraw(200);

        System.out.println(account);

    }
}
