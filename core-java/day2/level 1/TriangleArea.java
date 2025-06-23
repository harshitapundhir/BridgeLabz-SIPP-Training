import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble(), height = sc.nextDouble();
        double areaCm = 0.5 * base * height, areaIn = areaCm / 6.4516;
        System.out.printf("Area: %.2f cm², %.2f in²\n", areaCm, areaIn);
    }
}
