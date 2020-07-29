import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCompanies = input.nextInt();
        int[] yearlyIncomes = new int[numCompanies];
        int[] taxes = new int[numCompanies];
        int highestTaxesCo = -1;
        double highestTaxAmt = -1.0;
        double currentTaxAmount = 0.0;
        double currentTaxRate = 0.0;

        for (int i = 0; i < numCompanies; i++) {
            yearlyIncomes[i] = input.nextInt();
        }

        for (int i = 0; i < numCompanies; i++) {
            taxes[i] = input.nextInt();
        }

        for (int i = 0; i < numCompanies; i++) {
            currentTaxRate = taxes[i] / 100.0;
            currentTaxAmount = currentTaxRate * yearlyIncomes[i];
            if (currentTaxAmount > highestTaxAmt) {
                highestTaxesCo = i + 1;
                highestTaxAmt = currentTaxAmount;
            }
        }

        System.out.println(highestTaxesCo);
    }
}