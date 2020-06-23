import java.util.Scanner;

class Main {
    private static boolean testIsNotCoincidence(int[] array, int firstNumber, int secondNumber) {
        boolean secondCoincidence = false;
        int valueCoincidence = 0;

        for (int i : array) {
            if (i == firstNumber) {
                if (secondCoincidence && valueCoincidence == secondNumber) {
                    return false;
                }
                valueCoincidence = firstNumber;
                secondCoincidence = true;
            } else if (i == secondNumber) {
                if (secondCoincidence && valueCoincidence == firstNumber) {
                    return false;
                }
                valueCoincidence = secondNumber;
                secondCoincidence = true;
            } else {
                secondCoincidence = false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(testIsNotCoincidence(array, firstNumber, secondNumber));
    }
}