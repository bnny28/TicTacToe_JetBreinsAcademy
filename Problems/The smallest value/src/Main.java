import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long factorial = 1;
        long result = 0;

        while (factorial <= number) {
            result += 1;
            factorial *= result;
        }

        System.out.println(result);
    }
}