package task_12;


public class Main {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12}};

        editOdd(array);
        System.out.println(sumEven(array));
        showArray(array);
    }

    static void editOdd(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = 0;
                }
            }
        }

    }

    static int sumEven(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
