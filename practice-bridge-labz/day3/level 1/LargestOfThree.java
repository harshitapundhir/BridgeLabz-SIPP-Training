import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Logic
        boolean firstIsLargest = (number1 > number2) && (number1 > number3);
        boolean secondIsLargest = (number2 > number1) && (number2 > number3);
        boolean thirdIsLargest = (number3 > number1) && (number3 > number2);

        // Output
        System.out.println("Is the first number the largest? " + (firstIsLargest ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (secondIsLargest ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (thirdIsLargest ? "Yes" : "No"));
    }
}

