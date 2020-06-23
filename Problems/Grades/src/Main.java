import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBalls = scanner.nextInt();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for (int i = 0; i < countBalls; i++) {
            int ball = scanner.nextInt();
            if (ball == 5) {
                countA += 1;
            } else if (ball == 4) {
                countB += 1;
            } else if (ball == 3) {
                countC += 1;
            } else if (ball == 2) {
                countD += 1;
            }
        }
        System.out.printf("%s %s %s %s", countD, countC, countB, countA);
    }
}