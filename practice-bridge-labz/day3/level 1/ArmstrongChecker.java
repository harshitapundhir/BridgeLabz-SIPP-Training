import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number, sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number = number / 10;
        }

        if (sum == originalNumber)
            System.out.println(originalNumber + " is an Armstrong Number.");
        else
            System.out.println(originalNumber + " is not an Armstrong Number.");

        input.close();
    }
}

