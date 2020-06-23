import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeSequence = scanner.nextInt();
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        int indexSubArray = 0;

        for (int i = 0; i < sizeSequence; i++) {
            if (i == 0) {
                array.add(new ArrayList<>());
                array.get(indexSubArray).add(scanner.nextInt());
            } else {
                int nextInt = scanner.nextInt();
                ArrayList<Integer> subArray = array.get(indexSubArray);
                if (nextInt > subArray.get(subArray.size() - 1)) {
                    subArray.add(nextInt);
                } else {
                    array.add(new ArrayList<>());
                    indexSubArray += 1;
                    array.get(indexSubArray).add(nextInt);
                }
            }
        }

        int maxSequence = 1;
        for (ArrayList<Integer> subArray : array) {
            if (maxSequence < subArray.size()) {
                maxSequence = subArray.size();
            }
        }
        System.out.println(maxSequence);
    }
}