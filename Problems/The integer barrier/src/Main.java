import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            } else if (result < 1000) {
                result += number;
            }
        }
        if (result >= 1000) {
            result -= 1000;
        }
        System.out.println(result);
    }
}