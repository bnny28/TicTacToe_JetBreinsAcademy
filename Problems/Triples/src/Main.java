import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = scanner.nextInt();
        }

        int countTriples = 0;
        for (int i = 0; i < sizeArray; i++) {
            if (i + 2 >= sizeArray) {
                break;
            }
            if (array[i] + 1 == array[i + 1] && array[i + 1] + 1 == array[i + 2]) {
                countTriples += 1;
            }
        }
        System.out.println(countTriples);
    }
}