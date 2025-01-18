import java.util.Scanner;

public class CreditScoreCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize the scanner

        // Input the choice
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // Credit Score Calculation
                int latePayments = sc.nextInt(); // Input number of late payments
                int creditScore;
                switch (latePayments) {
                    case 0: creditScore = 800; break;
                    case 1: creditScore = 750; break;
                    case 2: creditScore = 700; break;
                    case 3: creditScore = 650; break;
                    case 4: creditScore = 600; break;
                    case 5: creditScore = 550; break;
                    default: creditScore = -1; // Invalid input
                }
                if (creditScore != -1) {
                    System.out.println("Credit Score: " + creditScore);
                }
                break;

            case 2: // Debt Score Calculation
                double debtToIncomeRatio = sc.nextDouble(); // Input debt-to-income ratio
                if (debtToIncomeRatio >= 0 && debtToIncomeRatio <= 100) {
                    if (debtToIncomeRatio <= 30) {
                        System.out.println("Debt Score: Good");
                    } else if (debtToIncomeRatio <= 50) {
                        System.out.println("Debt Score: Average");
                    } else {
                        System.out.println("Debt Score: Poor");
                    }
                }
                break;

            case 3: // Income Score Calculation
                double annualIncome = sc.nextDouble(); // Input annual income
                if (annualIncome >= 0 && annualIncome <= 1_000_000) {
                    if (annualIncome >= 50_000) {
                        System.out.println("Income Score: Good");
                    } else if (annualIncome > 30_000) {
                        System.out.println("Income Score: Average");
                    } else {
                        System.out.println("Income Score: Poor");
                    }
                }
                break;

            default: // Invalid choice
                System.out.println("Invalid choice.");
        }

        sc.close(); // Close the scanner
    }
}
