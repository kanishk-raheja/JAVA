import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int marks4 = sc.nextInt();
        int marks5 = sc.nextInt();
        int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        int average = totalMarks / 5;
        System.out.println("Average score: " + average);
        if (average >= 50) {
            System.out.println("The student has passed");
        } else {
            System.out.println("The student has failed");
        }

        sc.close();
    }
}
