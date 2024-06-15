package task_6;

import java.util.Scanner;

public class Main {
    // Sum all numbers to 5
    //RECURSION


    // Рекурсивний метод для обчислення суми чисел до заданого числа n
    public static int sumNumbers(int n) {
        // Базовий випадок: якщо n = 1, повертаємо 1
        if (n == 1) {
            return 1;
        }
        // Рекурсивний виклик: сума числа n та суми всіх чисел до n-1
        return n + sumNumbers(n - 1);
    }

    public static void main(String[] args) {
        // Введення числа n з консолі
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число n: ");
        int n = scanner.nextInt();

        // Обчислення суми чисел до заданого числа та виведення результату
        int sum = sumNumbers(n);
        System.out.println("Сума всіх чисел до " + n + ": " + sum);
    }
}