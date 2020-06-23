import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextInt();
        double percent = scanner.nextInt();
        double targetProfit = scanner.nextInt();
        int countYears = 0;
        double currentProfit = money;

        while (currentProfit < targetProfit) {
            countYears += 1;
            currentProfit += currentProfit * percent / 100;
        }
        System.out.println(countYears);
    }
}