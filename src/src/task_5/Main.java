package task_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer level (BRONZE, SILVER, GOLD, PLATINUM):");
        String levelInput = scanner.nextLine().toUpperCase();

        try {
            LevelCustomers level = LevelCustomers.valueOf(levelInput);
            System.out.println("Level: " + level);

            switch (level) {
                case BRONZE:
                    System.out.println("Discount: 5%");
                    break;
                case SILVER:
                    System.out.println("Discount: 10%");
                    break;
                case GOLD:
                    System.out.println("Discount: 15%");
                    break;
                case PLATINUM:
                    System.out.println("Discount: 20%");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Option");
        }

        scanner.close();
    }

}
