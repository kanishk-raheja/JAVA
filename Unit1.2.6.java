import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double result = ((a + b) * (double) c / (a - b)) + (c % a);
        System.out.printf("%.2f", result);
    }
}
