import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthSequence = scanner.nextInt();
        long result = 0;
        int currentLoop = 0;

        while (currentLoop < lengthSequence) {
            int input = scanner.nextInt();
            if (input > result && input % 4 == 0) {
                result = input;
            }
            currentLoop += 1;
        }

        System.out.println(result);
    }
}