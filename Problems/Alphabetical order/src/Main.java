import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s");
        String[] sortInput = Arrays.stream(input).sorted().toArray(String[]::new);

        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals(sortInput[i])) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}