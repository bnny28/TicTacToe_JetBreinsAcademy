import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int max = getMax(array);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max == array[i][j]) {
                    System.out.printf("%s %s", i, j);
                    return;
                }
            }
        }
    }

    private static int getMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : array) {
            int maxInRow = Arrays.stream(ints).summaryStatistics().getMax();
            if (max < maxInRow) {
                max = maxInRow;
            }
        }
        return max;
    }
}