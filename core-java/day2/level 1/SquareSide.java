import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", p / 4, p);
    }
}

