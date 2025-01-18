import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double originalPrice = sc.nextDouble();
        char discountType = sc.next().charAt(0);
        double discountValue = sc.nextDouble();
        if (discountType == 'F') { // Flat discount
            if (discountValue <= originalPrice && discountValue >= 0) {
                double finalPrice = originalPrice - discountValue;
                System.out.printf("Discount Amount: Rs.%.2f\n", discountValue);
                System.out.printf("Final Price: Rs.%.2f\n", finalPrice);
            } else {
                System.out.println("Invalid discount value.");
            }
        } else if (discountType == 'P') { // Percentage discount
            if (discountValue >= 0 && discountValue <= 100) {
                double discountAmount = (originalPrice * discountValue) / 100;
                double finalPrice = originalPrice - discountAmount;
                System.out.printf("Discount Percentage: %.2f\n", discountValue);
                System.out.printf("Final Price: Rs.%.2f\n", finalPrice);
            } else {
                System.out.println("Invalid discount value.");
            }
        } else { // Invalid discount type
            System.out.println("Invalid discount type");
        }

        sc.close();
    }
}
