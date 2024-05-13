public class AreaCalculator {
    // Method to calculate the area of a square
    public static double calculateAreaSquare(double side) {
        return side * side;
    }
    // Method to calculate the area of a rectangle
    public static double calculateAreaRect(double length, double width) {
        return length * width;
    }
    // Method to calculate the area of a circle
    public static double calculateAreaCircle(double radius) {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        double side = 5.0;
        double length = 6.0;
        double width = 4.0;
        double radius = 3.0;
        // Calculate and print the areas
        System.out.println("Area of square: " + calculateAreaSquare(side));
        System.out.println("Area of rectangle: " + calculateAreaRect(length, width));
        System.out.println("Area of circle: " + calculateAreaCircle(radius));
    }
}