import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.printf("Add: %.2f Sub: %.2f Mul: %.2f Div: %.2f\n", a + b, a - b, a * b, a / b);
    }
}

