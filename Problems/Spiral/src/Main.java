import java.util.Scanner;

class Main {

    private static int[][] turnToLeft(int[][] array) {
        int[][] resultArray = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[array[i].length - j - 1][i] = array[i][j];
            }
        }
        return resultArray;
    }

    private static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j : ints) {
                System.out.printf("%s ", j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] array = new int[number][number];
        int counter = 1;

        for (int i = 0; i < (number + (number % 2)) * 2; i++) {
            for (int j = 0; j < number; j++) {
                if (array[i / 4][j] == 0) {
                    array[i / 4][j] = counter++;
                }
            }
            array = turnToLeft(array);
        }

        printArray(array);
    }
}