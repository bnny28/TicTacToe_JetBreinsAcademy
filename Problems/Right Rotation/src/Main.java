import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayStr = scanner.nextLine().split("\\s");
        ArrayList<Integer> array = new ArrayList<>(arrayStr.length);
        for (String s : arrayStr) {
            array.add(Integer.valueOf(s));
        }
        int number = scanner.nextInt();

        Collections.rotate(array, number);
        for (Integer i : array) {
            System.out.printf("%s ", i);
        }
    }
}