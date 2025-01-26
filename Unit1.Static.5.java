import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int monthlyRent = scanner.nextInt();
        int leaseDuration = scanner.nextInt();
        int totalCost = monthlyRent * leaseDuration;

        System.out.println("Total Cost: " + totalCost);

        switch ((totalCost > 5000) ? 3 : (totalCost > 1000 ? 2 : 1)) {
            case 1:
                System.out.println("Payment Method Suggestion: Payment by cash or check is recommended.");
                break;
            case 2:
                System.out.println("Payment Method Suggestion: Payment by credit card is recommended.");
                break;
            case 3:
                System.out.println("Payment Method Suggestion: Payment by bank transfer is recommended.");
                break;
        }

        scanner.close();
    }
}
