import java.util.Scanner;
public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextDouble();
        int qty = sc.nextInt();
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f\n", unit * qty, qty, unit);
    }
}
