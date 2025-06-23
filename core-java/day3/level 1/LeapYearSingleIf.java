import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            System.out.println("Year must be >= 1582 (Gregorian calendar).");
        }

        input.close();
    }
}

