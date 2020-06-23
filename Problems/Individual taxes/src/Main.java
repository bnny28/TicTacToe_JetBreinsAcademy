import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCompanies = scanner.nextInt();
        int[] companiesIncomes = new int[countCompanies];
        for (int i = 0; i < countCompanies; i++) {
            companiesIncomes[i] = scanner.nextInt();
        }
        int[] companiesTax = new int[countCompanies];
        for (int i = 0; i < countCompanies; i++) {
            companiesTax[i] = scanner.nextInt();
        }
        double[] companiesValues = new double[countCompanies];
        for (int i = 0; i < countCompanies; i++) {
            companiesValues[i] = companiesIncomes[i] * companiesTax[i] / 100d;
        }

        double max = Arrays.stream(companiesValues).summaryStatistics().getMax();
        for (int i = 0; i < countCompanies; i++) {
            if (companiesValues[i] == max) {
                System.out.println(i + 1);
            }
        }
    }
}