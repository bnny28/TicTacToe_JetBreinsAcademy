import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowBound = scanner.nextInt();
        int upBound = scanner.nextInt();
        int countRoots = 0;
        int sumRoots = 0;

        for (int i = lowBound; i < upBound + 1; i++) {
            if (i % 3 == 0) {
                sumRoots += i;
                countRoots += 1;
            }
        }
        System.out.println((double) sumRoots / countRoots);
    }
}