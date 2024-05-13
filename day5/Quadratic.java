import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients a, b, and c of the quadratic equation ax^2 + bx + c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1 of x = " + root1);
            System.out.println("Root 2 of x = " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Root of x = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println("Root 1 of x = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 of x = " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }
}
