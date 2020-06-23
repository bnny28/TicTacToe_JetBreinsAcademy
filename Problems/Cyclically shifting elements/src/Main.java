import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            array.add(scanner.nextInt());
        }

        Collections.rotate(array, 1);
        for (Integer i : array) {
            System.out.printf("%s ", i);
        }
    }
}