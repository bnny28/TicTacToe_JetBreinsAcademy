import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthSequence = scanner.nextInt();
        long result = 0;

        for (int i = 0; i < lengthSequence; i++) {
            int input = scanner.nextInt();
            if (input > result && input % 4 == 0) {
                result = input;
            }
        }

        System.out.println(result);
    }
}