import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'S' to Start timer: ");
        String ch = scan.nextLine();
        Instant start = null;
        if (ch.equalsIgnoreCase("s")) {
            System.out.println("Timer started");
            start = Instant.now(clock); // Start Counting
        } else {
            System.out.println("Invalid input.");
            scan.close();
            return;
        }

        System.out.print("Enter 'O' to Stop timer: ");
        String ch1 = scan.nextLine();
        if (ch1.equalsIgnoreCase("o")) {
            System.out.println("Timer stopped");
        } else {
            System.out.println("Invalid input.");
            scan.close();
            return;
        }
        Instant end = Instant.now(clock); // End Counting
        Duration duration = Duration.between(start, end);
        long seconds = duration.getSeconds();
        long hh = seconds / 3600;
        long mm = (seconds % 3600) / 60;
        long ss = seconds % 60;

        System.out.printf("Execution time: %02d:%02d:%02d%n", hh, mm, ss);
        scan.close();
    }
}
