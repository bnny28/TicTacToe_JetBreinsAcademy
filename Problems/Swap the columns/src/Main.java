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

    private static int[][] turnToRight(int[][] array) {
        int[][] resultArray = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[j][array.length - i - 1] = array[i][j];
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimensionX = scanner.nextInt();
        int dimensionY = scanner.nextInt();
        int[][] array = new int[dimensionX][dimensionY];
        for (int i = 0; i < dimensionX; i++) {
            for (int j = 0; j < dimensionY; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int numColumn1 = scanner.nextInt();
        int numColumn2 = scanner.nextInt();

        int[][] rightRotateArray = turnToRight(array);
        int[] buffer = rightRotateArray[numColumn1];
        rightRotateArray[numColumn1] = rightRotateArray[numColumn2];
        rightRotateArray[numColumn2] = buffer;
        array = turnToLeft(rightRotateArray);

        for (int i = 0; i < dimensionX; i++) {
            for (int j = 0; j < dimensionY; j++) {
                System.out.printf("%s ", array[i][j]);
            }
            System.out.println();
        }
    }
}