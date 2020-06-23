import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int partsCount = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        int q = 'q';  // 1
        char ch2 = q; // 2
        short s = 1;  // 3
        char ch3 = s; // 4

        for (int i = 0; i < partsCount; i++) {
            int diagnostic = scanner.nextInt();
            if (diagnostic == 0) {
                perfect += 1;
            } else if (diagnostic == -1) {
                smaller += 1;
            } else {
                larger += 1;
            }
        }

        System.out.printf("%s %s %s", perfect, larger, smaller);
    }
}