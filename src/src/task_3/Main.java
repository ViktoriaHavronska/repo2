package task_3;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1, 0);
        BankWorker bankWorker = new BankWorker(bankAccount);
        bankWorker.start();
    }
}
