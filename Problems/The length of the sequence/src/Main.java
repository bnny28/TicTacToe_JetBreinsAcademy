import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (scanner.hasNextLine()) {
            int nextNumber = scanner.nextInt();
            if (nextNumber == 0) {
                break;
            } else {
                result += 1;
            }
        }
        System.out.println(result);
    }
}