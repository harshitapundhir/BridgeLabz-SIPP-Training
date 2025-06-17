import java.util.Scanner;

public class TrigonometryCalculator {

    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double angleRadians = Math.toRadians(angleDegrees);

        double[] results = new double[3];
        results[0] = Math.sin(angleRadians);
        results[1] = Math.cos(angleRadians);
        results[2] = Math.tan(angleRadians);

        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] trigValues = calculateTrigonometricFunctions(angle);

        System.out.printf("Sine(%.2f°) = %.4f%n", angle, trigValues[0]);
        System.out.printf("Cosine(%.2f°) = %.4f%n", angle, trigValues[1]);
        System.out.printf("Tangent(%.2f°) = %.4f%n", angle, trigValues[2]);
    }
}

