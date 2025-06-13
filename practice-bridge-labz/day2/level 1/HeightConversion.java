import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm = sc.nextDouble(), inches = cm / 2.54, feet = inches / 12;
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f\n", cm, feet, inches);
    }
}

