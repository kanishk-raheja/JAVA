import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subject1 = sc.nextInt();
        int subject2 = sc.nextInt();
        int subject3 = sc.nextInt();
        int choice = sc.nextInt();
        switch (choice) {
            case 1: // Average Marks
                double average = (subject1 + subject2 + subject3) / 3.0;
                System.out.printf("Average Marks: %.2f\n", average);
                break;

            case 2: // Highest Marks
                double highest = Math.max(subject1, Math.max(subject2, subject3));
                System.out.printf("Highest Marks: %.1f\n", highest);
                break;

            case 3: // Lowest Marks
                double lowest = Math.min(subject1, Math.min(subject2, subject3));
                System.out.printf("Lowest Marks: %.1f\n", lowest);
                break;

            default: // Invalid choice
                System.out.println("Invalid choice.");
        }
    }
}
