import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowBound = scanner.nextInt();
        int upBound = scanner.nextInt();
        long result = 1;

        for (int i = lowBound; i < upBound; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}