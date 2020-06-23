import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] array = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        boolean isSymmetry = true;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (array[i][j] != array[j][i]) {
                    isSymmetry = false;
                    break;
                }
            }
        }

        System.out.println(isSymmetry ? "YES" : "NO");
    }
}