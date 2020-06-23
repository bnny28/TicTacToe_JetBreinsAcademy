import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowBound = scanner.nextInt();
        int upBound = scanner.nextInt();
        int number = scanner.nextInt();
        int result = 0;

        for (int i = lowBound; i < upBound + 1; i++) {
            if (i % number == 0) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}