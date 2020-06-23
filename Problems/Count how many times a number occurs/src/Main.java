import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = scanner.nextInt();
        }
        int checkNumber = scanner.nextInt();

        int countInclusion = 0;
        for (int i : array) {
            if (i == checkNumber) {
                countInclusion += 1;
            }
        }
        System.out.println(countInclusion);
    }
}