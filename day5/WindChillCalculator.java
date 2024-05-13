import java.util.Scanner;

public class WindChillCalculator {
    // Method to calculate wind chill
    public static double calculateWindChill(float temperature, float windSpeed) {
        return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input month
        System.out.print("Enter the month number (1 to 12): ");
        int month = scanner.nextInt();
        // Check if month is valid for wind chill calculation
        if (month == 11 || month == 12 || month == 1 || month == 2) {
            // Input temperature
            System.out.print("Enter the temperature between -50 and 50 °F: ");
            float temperature = scanner.nextFloat();
            // Input wind speed
            System.out.print("Enter the wind speed between 3 and 120 mph: ");
            float windSpeed = scanner.nextFloat();
            // Check for valid temperature and wind speed ranges
            if (Math.abs(temperature) > 50 || windSpeed < 3 || windSpeed > 120) {
                System.out.println("Invalid input. Temperature must be between -50 and 50 °F, and wind speed between 3 and 120 mph.");
            } else {
                // Calculate wind chill using the method
                double windChill = calculateWindChill(temperature, windSpeed);
                System.out.printf("Wind Chill: %.2f °F for Month %d with temperature %.2f and wind speed %.2f\n", windChill, month, temperature, windSpeed);
            }
        } else {
            System.out.printf("Wind chill computation is not applicable for month %d.\n", month);
        }
        scanner.close();
    }
}