import java.util.Scanner;

public class WindChillCalculator {

    public static double calculateWindChill(double temperature, double windSpeed) {
        if (temperature > 50 || windSpeed < 3) {
            // Wind chill formula is only valid for T <= 50°F and wind speed >= 3 mph
            return Double.NaN;
        }
        return 35.74 + (0.6215 * temperature)
               - 35.75 * Math.pow(windSpeed, 0.16)
               + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed in mph: ");
        double windSpeed = sc.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);

        if (Double.isNaN(windChill)) {
            System.out.println("Wind chill calculation is only valid for temperature <= 50°F and wind speed >= 3 mph.");
        } else {
            System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
        }
    }
}

