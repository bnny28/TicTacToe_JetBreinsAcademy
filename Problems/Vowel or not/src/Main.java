import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        String s = String.valueOf(ch).toUpperCase();
        return Arrays.asList(new String[]{"A", "O", "E", "U", "I"}).contains(s);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}