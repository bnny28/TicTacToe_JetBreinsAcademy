import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        ArrayList<Integer> multiplications = new ArrayList<>();

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                if (i != j && array[i] > 0 && array[j] > 0) {
                    multiplications.add(array[i] * array[j]);
                }
            }
        }
        System.out.println(Collections.max(multiplications));
    }
}