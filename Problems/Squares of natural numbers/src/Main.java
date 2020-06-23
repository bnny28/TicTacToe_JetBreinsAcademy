import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int currentLoop = 1;
        while (currentLoop <= number) {
            int square = currentLoop * currentLoop;
            if (square > number) {
                break;
            } else {
                System.out.println(square);
                currentLoop += 1;
            }
        }
    }
}