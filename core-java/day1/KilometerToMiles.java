import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert to miles
        double miles = kilometers * 0.621371;

        // Display the result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        scanner.close();
    }
}
