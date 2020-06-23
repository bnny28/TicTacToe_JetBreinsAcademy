import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        String operation = scanner.next();
        long y = scanner.nextLong();
        switch (operation) {
            case "+": {
                System.out.println(x + y);
                break;
            }
            case "-": {
                System.out.println(x - y);
                break;
            }
            case "*": {
                System.out.println(x * y);
                break;
            }
            case "/": {
                if (y == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(x / y);
                }
                break;
            }
            default: {
                System.out.println("Unknown operator");
            }
        }
    }
}