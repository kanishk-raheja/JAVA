import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double distance1 = Math.sqrt(x1 * x1 + y1 * y1);
        double distance2 = Math.sqrt(x2 * x2 + y2 * y2);

        double closerDistance = Math.min(distance1, distance2);

        String orientation;
        if (x1 == x2) {
            orientation = "Vertical";
        } else if (y1 == y2) {
            orientation = "Horizontal";
        } else {
            orientation = "Oblique";
        }

        System.out.printf("Closer Distance: %.1f%n", closerDistance);
        System.out.println("Orientation: " + orientation);

    }
}
