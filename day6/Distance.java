import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = num.nextInt();
        System.out.print("Enter value of y: ");
        int y = num.nextInt();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        // Print the result
        System.out.println("Euclidean distance from point (" + x + ", " + y + ") to the origin (0, 0): " + distance);
        num.close();
    }
}
