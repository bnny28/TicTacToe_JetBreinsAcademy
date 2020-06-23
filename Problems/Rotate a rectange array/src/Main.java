import java.util.Scanner;

class Main {
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

        for (int i = 0; i < dimensionY; i++) {
            for (int j = dimensionX - 1; j >= 0; j--) {
                System.out.printf("%s ", array[j][i]);
            }
            System.out.println();
        }
    }
}