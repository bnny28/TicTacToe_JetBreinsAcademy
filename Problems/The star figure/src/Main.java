import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static char[][] turnToRight(char[][] array) {
        char[][] resultArray = new char[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[j][array.length - i - 1] = array[i][j];
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        char[][] array = new char[number][number];
        for (int i = 0; i < number; i++) {
            Arrays.fill(array[i], '.');
        }

        Arrays.fill(array[number / 2], '*');
        for (int i = 0; i < number; i++) {
            array[i][i] = '*';
        }
        array = turnToRight(array);
        Arrays.fill(array[number / 2], '*');
        for (int i = 0; i < number; i++) {
            array[i][i] = '*';
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.printf("%s ", array[i][j]);
            }
            System.out.println();
        }
    }
}