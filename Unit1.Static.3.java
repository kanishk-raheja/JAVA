import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int k = scanner.nextInt(); 

        int movieTime = n * 45; 
        int breaks = (n % k == 0) ? (n / k - 1) : (n / k); 
        int breakTime = breaks * 15; 
        int totalTime = movieTime + breakTime; 

        System.out.println(totalTime + " minutes");

    }
}
