import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimensionX = scanner.nextInt();
        int dimensionY = scanner.nextInt();
        Integer[][] array = new Integer[dimensionX][dimensionY];
        for (int i = 0; i < dimensionX; i++) {
            for (int j = 0; j < dimensionY; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int countTickets = scanner.nextInt();
        Integer[] findPlaces = new Integer[countTickets];
        Arrays.fill(findPlaces, 0);

        for (int i = 0; i < dimensionX; i++) {
            if (Collections.indexOfSubList(Arrays.asList(array[i]),
                    Arrays.asList(findPlaces)) != -1) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(0);
    }
}