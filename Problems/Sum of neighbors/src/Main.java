import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            array.add(Arrays.stream(input.split("\\s")).map(Integer::valueOf)
                          .collect(Collectors.toCollection(ArrayList::new)));
            input = scanner.nextLine();
        }

        int[][] result = new int[array.size()][array.get(0).size()];
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.get(0).size(); j++) {
                int up = getUpValue(array, i, j);
                int down = getDownValue(array, i, j);
                int left = getLeftValue(array, i, j);
                int right = getRightValue(array, i, j);
                result[i][j] = up + down + left + right;
            }

        }

        printArray(result);
    }

    private static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j : ints) {
                System.out.printf("%s ", j);
            }
            System.out.println();
        }
    }

    private static int getRightValue(ArrayList<ArrayList<Integer>> array, int i, int j) {
        if (j < array.get(0).size() - 1) {
            return array.get(i).get(j + 1);
        } else {
            return array.get(i).get(0);
        }
    }

    private static int getLeftValue(ArrayList<ArrayList<Integer>> array, int i, int j) {
        if (j == 0) {
            return array.get(i).get(array.get(0).size() - 1);
        } else {
            return array.get(i).get(j - 1);
        }
    }

    private static int getDownValue(ArrayList<ArrayList<Integer>> array, int i, int j) {
        if (i < array.size() - 1) {
            return array.get(i + 1).get(j);
        } else {
            return array.get(0).get(j);
        }
    }

    private static int getUpValue(ArrayList<ArrayList<Integer>> array, int i, int j) {
        if (i == 0) {
            return array.get(array.size() - 1).get(j);
        } else {
            return array.get(i - 1).get(j);
        }
    }
}