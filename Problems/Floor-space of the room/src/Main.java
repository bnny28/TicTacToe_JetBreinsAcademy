import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        switch (input) {
            case "triangle": {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                System.out.println(getSquare(a, b, c));
                break;
            }
            case "rectangle": {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(getSquare(a, b));
                break;
            }
            case "circle": {
                int r = scanner.nextInt();
                System.out.println(getSquare(r));
                break;
            }
            default: {
                System.out.println("not a valid input");
                break;
            }
        }
    }

    private static double getSquare(int a, int b, int c) {
        int perimeter = a + b + c;
        double halfPerimeter = perimeter / 2d;
        return Math.sqrt(
            halfPerimeter *
                (halfPerimeter - a) *
                (halfPerimeter - b) *
                (halfPerimeter - c)
        );
    }

    private static double getSquare(int a, int b) {
        return a * b;
    }

    private static double getSquare(int r) {
        return 3.14 * r * r;
    }
}