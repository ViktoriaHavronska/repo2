package task_3;

import java.util.Scanner;

public class BankWorker {
    private final BankAccount bankAccount;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(bankAccount);
        System.out.println("Select: " +
                "deposit, " + "withdraw, " + "check. ");

        String select = scanner.nextLine();


        switch (select) {
            case "deposit" -> deposit();
            case "withdraw" -> withdraw();
            case "check" -> System.out.println(bankAccount);
            default -> System.out.println("invalid Option");
        }
    }

    public BankWorker(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    void deposit() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much deposit do you want to make ?");

        double input = scanner.nextDouble();
        bankAccount.deposit(input);
        System.out.println("You have deposited : " + input);

        System.out.println(bankAccount);
    }

    void withdraw() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much withdraw do you want to make ?");

        double input = scanner.nextDouble();
        bankAccount.withdraw(input);
        System.out.println("You have withdrawal : " + input);

        System.out.println(bankAccount);
    }

}
