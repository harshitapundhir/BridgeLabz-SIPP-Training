import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid number.");
            return;
        }

        int i = 1;
        System.out.println("Multiples of " + number + " below 100:");
        while (i < 100) {
            if (i % number == 0)
                System.out.println(i);
            i++;
        }
    }
}

