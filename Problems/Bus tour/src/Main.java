import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int countBridges = scanner.nextInt();

        for (int i = 1; i < countBridges + 1; i++) {
            int currentBridgeHeight = scanner.nextInt();
            if (currentBridgeHeight <= busHeight) {
                System.out.printf("Will crash on bridge %s", i);
                return;
            }
        }
        System.out.print("Will not crash");
    }
}