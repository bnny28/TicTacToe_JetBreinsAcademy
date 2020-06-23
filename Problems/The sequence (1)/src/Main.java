import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int countPrint = 0;

        for (int i = 1; i < number + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (countPrint < number) {
                    System.out.printf("%s ", i);
                    countPrint += 1;
                }
            }
        }
    }
}