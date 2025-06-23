import java.util.Scanner;

public class naturalnumbersum {

    public static int findSumUsingLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int sum = findSumUsingLoop(number);
            System.out.println("Sum of first " + number + " natural numbers is: " + sum);
        }
    }
}

