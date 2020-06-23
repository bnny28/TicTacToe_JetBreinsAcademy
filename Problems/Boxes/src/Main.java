import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] box1 =
                Arrays.stream(scanner.nextLine().split("\\s"))
                        .map(Integer::valueOf).toArray(Integer[]::new);
        Integer[] box2 =
                Arrays.stream(scanner.nextLine().split("\\s"))
                        .map(Integer::valueOf).toArray(Integer[]::new);

        Arrays.sort(box1);
        Arrays.sort(box2);
        if (Arrays.equals(box1, box2)) {
            System.out.println("Box 1 = Box 2");
        } else if (box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }
}