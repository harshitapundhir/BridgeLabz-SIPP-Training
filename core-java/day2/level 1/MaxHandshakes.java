import java.util.Scanner;
public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("Max handshakes = %d\n", n * (n - 1)/2);
    }
}
