import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int dimension = number * number;
        int[][] array = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        if (!checkRow(array, number)
                || !checkRow(turnToLeft(array), number)
                || !checkRow(getSubArray(array, number), number)) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
    }

    private static boolean checkRow(int[][] array, int number) {
        int dimension = number * number;
        int[] targetArray = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            targetArray[i] = i + 1;
        }
        for (int i = 0; i < dimension; i++) {
            int[] sortSubArray = array[i].clone();
            Arrays.sort(sortSubArray);
            if (!Arrays.equals(sortSubArray, targetArray)) {
                return false;
            }
        }
        return true;
    }

    private static int[][] getSubArray(int[][] array, int number) {
        int dimension = number * number;
        int[][] subArrays = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                int x = (i / number) * number + j / number;
                int y = (i % number) * number + j % number;
                subArrays[x][y] = array[i][j];
            }
        }
        return subArrays;
    }

    private static int[][] turnToLeft(int[][] array) {
        int[][] resultArray = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[array[i].length - j - 1][i] = array[i][j];
            }
        }
        return resultArray;
    }
}