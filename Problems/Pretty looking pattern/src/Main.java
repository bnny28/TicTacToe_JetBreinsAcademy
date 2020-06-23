import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] array = new char[4][4];
        for (int i = 0; i < 4; i++) {
            array[i] = scanner.nextLine().toCharArray();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == array[i][j + 1]
                        && array[i][j] == array[i + 1][j]
                        && array[i][j] == array[i + 1][j + 1]) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}