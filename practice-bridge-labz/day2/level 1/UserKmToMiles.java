import java.util.Scanner;
public class UserKmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter km: ");
        double km = sc.nextDouble(), miles = km / 1.6;
        System.out.printf("The total miles is %.2f mile for the given %.2f km\n", miles, km);
    }
}

