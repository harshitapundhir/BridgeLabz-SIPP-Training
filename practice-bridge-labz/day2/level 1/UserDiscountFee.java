import java.util.Scanner;
public class UserDiscountFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee = sc.nextDouble(), discountPercent = sc.nextDouble();
        double discount = fee * discountPercent / 100;
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, fee - discount);
    }
}
