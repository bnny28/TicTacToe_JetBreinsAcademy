import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = scanner.nextInt();
        }

        int max = Arrays.stream(array).summaryStatistics().getMax();
        for (int i = 0; i < sizeArray; i++) {
            if (max == array[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}