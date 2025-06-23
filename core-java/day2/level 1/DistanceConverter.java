import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = sc.nextDouble();
        double yards = feet / 3, miles = yards / 1760;
        System.out.printf("Distance: %.2f feet = %.2f yards = %.5f miles\n", feet, yards, miles);
    }
}

